/*
 *   Copyright (c) 2025 Stefano Marano https://github.com/StefanoMarano80017
 *   All rights reserved.

 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at

 *   http://www.apache.org/licenses/LICENSE-2.0

 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package com.gateway.apiGateway.filter.redisCacheFilter;

import java.util.Map;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.NettyWriteResponseFilter;
import org.springframework.core.Ordered;
import org.springframework.core.io.buffer.DataBufferUtils;
import org.springframework.data.redis.core.ReactiveStringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import com.gateway.apiGateway.Factory.RedisCacheFilterGatewayFilterFactory.Config;

import reactor.core.publisher.Mono;
import reactor.util.function.Tuple2;
import reactor.util.function.Tuples;

/**
 * Filtraggio delle richieste HTTP per la gestione della cache tramite Redis.
 * Questo filtro esamina la richiesta HTTP e, se applicabile, la memorizza nella cache per migliorare le performance.
 */
@Component
public class RedisCacheFilter implements GatewayFilter, Ordered {

    private static final Logger logger = LoggerFactory.getLogger(RedisCacheFilter.class);
    private final ReactiveStringRedisTemplate redisTemplate;
    private final Config config;

    /**
     * Restituisce l'ordine di esecuzione del filtro nella catena di filtri.
     * Questo filtro deve essere eseguito prima del filtro di scrittura della risposta.
     *
     * @return l'ordine di esecuzione del filtro
     */
    @Override
    public int getOrder() {
        return NettyWriteResponseFilter.WRITE_RESPONSE_FILTER_ORDER - 1;
    }

    /**
     * Costruttore del filtro, che riceve il template Redis reattivo e la configurazione.
     *
     * @param redisTemplate template Redis reattivo per l'interazione con la cache
     * @param config        la configurazione per il filtro
     */
    public RedisCacheFilter(ReactiveStringRedisTemplate redisTemplate, Config config) {
        this.redisTemplate = redisTemplate;
        this.config = config;
    }

    /**
     * Applica il filtro alla richiesta HTTP, gestendo la cache di Redis se applicabile.
     *
     * @param exchange l'exchange della richiesta HTTP
     * @param chain    la catena di filtri da proseguire
     * @return un oggetto Mono<Void> che rappresenta l'elaborazione asincrona della richiesta
     */
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        String method = exchange.getRequest().getMethod().toString();
        String path = exchange.getRequest().getURI().getPath();
        logger.info("[RedisCacheFilter] Processing request: method={}, path={}", method, path);

        // Verifica se il metodo della richiesta è cacheabile
        if (!config.isCacheable(method)) {
            logger.info("[RedisCacheFilter] Method {} is not cacheable. Proceeding without cache.", method);
            return chain.filter(exchange);
        }

        // Genera la chiave di cache per la richiesta
        return generateCacheKey(exchange)
                .flatMap(tuple -> {
                    ServerWebExchange CachedExchange = tuple.getT1();
                    String cacheKey = tuple.getT2();

                    logger.info("[RedisCacheFilter] Generated cache key: {}", cacheKey);
                    return chain.filter(CachedExchange);
                });
    }

    /**
     * Estrae il percorso (path) dalla richiesta HTTP.
     *
     * @param exchange l'exchange della richiesta HTTP
     * @return il path della richiesta
     */
    private String extractPath(ServerWebExchange exchange) {
        return exchange.getRequest().getURI().getPath();
    }

    /**
     * Estrae e formatta i parametri della query ordinandoli per chiave.
     * I parametri sono concatenati in una stringa con il formato "key=value&key2=value2".
     *
     * @param exchange l'exchange della richiesta HTTP
     * @return una stringa con i parametri della query ordinati per chiave
     */
    private String extractQueryParams(ServerWebExchange exchange) {
        return exchange.getRequest().getQueryParams().entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .map(entry -> entry.getKey() + "=" + String.join(",", entry.getValue()))
                .collect(Collectors.joining("&"));
    }

    /**
     * Genera una chiave unica per la cache basata su URL e corpo della richiesta.
     * Se la richiesta è un metodo GET, la chiave è costruita usando il path e i parametri della query.
     * Altrimenti, include un hash del corpo della richiesta per distinguere varianti.
     *
     * @param exchange l'exchange della richiesta HTTP
     * @return un Mono che restituisce una tupla contenente l'exchange mutato e la chiave di cache
     */
    private Mono<Tuple2<ServerWebExchange, String>> generateCacheKey(ServerWebExchange exchange) {
        // Genera la chiave di base usando il prefisso della cache, il path e i parametri della query
        String cachePrefix = config.getCachePrefix();
        String path = extractPath(exchange);
        String params = extractQueryParams(exchange);
        String keyBase = cachePrefix + path + ":" + params;

        // Se il metodo è GET, non serve l'hash del corpo
        if ("GET".equalsIgnoreCase(exchange.getRequest().getMethod().toString())) {
            return Mono.just(Tuples.of(exchange, keyBase));
        }

        // Per metodi diversi da GET, aggiungiamo l'hash del corpo
        return DataBufferUtils
            .join(exchange.getRequest().getBody())
            .flatMap(dataBuffer -> {
                byte[] bodyBytes = new byte[dataBuffer.readableByteCount()];
                dataBuffer.read(bodyBytes);
                DataBufferUtils.release(dataBuffer);
                // Decoriamo la richiesta per accedere al corpo
                CachedBodyRequestDecorator decoratedRequest = new CachedBodyRequestDecorator(exchange.getRequest(), bodyBytes);
                // Creiamo un nuovo ServerWebExchange con la richiesta decorata
                ServerWebExchange mutatedExchange = exchange.mutate().request(decoratedRequest).build();
                // Combiniamo la chiave base con l'hash del corpo della richiesta
                String finalKey = keyBase + ":" + decoratedRequest.getBodyHash();
                // Decoriamo la risposta per supportare la cache
                CachingServerHttpResponseDecorator cachedResponse = new CachingServerHttpResponseDecorator(
                    mutatedExchange.getResponse(), finalKey, redisTemplate, config.getTtl()
                );
                mutatedExchange = mutatedExchange.mutate().response(cachedResponse).build();
                return Mono.just(Tuples.of(mutatedExchange, finalKey));
            });
    }
}
