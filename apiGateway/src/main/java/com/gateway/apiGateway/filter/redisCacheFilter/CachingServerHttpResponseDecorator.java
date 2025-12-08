/*
 *   Copyright (c) 2025 Stefano Marano https://github.com/StefanoMarano80017
 *   All rights reserved.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package com.gateway.apiGateway.filter.redisCacheFilter;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.reactivestreams.Publisher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.core.io.buffer.DataBufferUtils;
import org.springframework.data.redis.core.ReactiveStringRedisTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.http.server.reactive.ServerHttpResponseDecorator;
import org.springframework.lang.NonNull;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Decorator for ServerHttpResponse that caches successful HTTP responses and
 * serves them from cache if available.
 * <p>
 * This class intercepts the response body, serializes it, and stores it in
 * Redis with a cache key. The response is also served from the cache when
 * available.
 * </p>
 */
public class CachingServerHttpResponseDecorator extends ServerHttpResponseDecorator {

    private static final Logger logger = LoggerFactory.getLogger(CachingServerHttpResponseDecorator.class);

    private final String cacheKey;
    private final Long ttl;
    private final CacheService cacheService;

    /**
     * Constructs a new CachingServerHttpResponseDecorator.
     *
     * @param delegate the original ServerHttpResponse to be decorated
     * @param cacheKey the unique key for storing/retrieving the cached response
     * @param redisTemplate the ReactiveStringRedisTemplate for interacting with
     * Redis
     * @param ttl the time-to-live for the cached response in seconds
     */
    public CachingServerHttpResponseDecorator(ServerHttpResponse delegate, String cacheKey,
            ReactiveStringRedisTemplate redisTemplate, Long ttl) {
        super(delegate);
        this.cacheKey = cacheKey;
        this.ttl = ttl;
        this.cacheService = new CacheService(redisTemplate);
    }

    /**
     * Writes the response body to the client. If the response is successful, it
     * caches the body in Redis.
     *
     * @param body the response body to write
     * @return a Mono indicating when the write is complete
     */
    @Override
    @NonNull
    public Mono<Void> writeWith(@NonNull Publisher<? extends DataBuffer> body) {
        if (!(body instanceof Flux)) {
            logger.error("Impossibile salvare la risposta in cache per la chiave: {}", cacheKey);
            return super.writeWith(body);
        }

        HttpStatusCode statusCode = getStatusCode();
        if (statusCode != null && !statusCode.is2xxSuccessful()) {
            return super.writeWith(body);
        }

        // Process and cache the response
        return super.writeWith(
                CacheProcess(cacheKey, body)
        );
    }

    private Mono<DataBuffer> CacheProcess(String cacheKey, @NonNull Publisher<? extends DataBuffer> body) {
        return cacheService
                .check(cacheKey)
                .flatMap(exists -> {
                    if (exists) {
                        // Cache hit
                        logger.info("[RedisCacheFilter] Cache hit for key: {}", cacheKey);
                        return writeCachedResponse();
                    } else {
                        // Cache miss
                        logger.info("[RedisCacheFilter] Cache miss for key: {}", cacheKey);
                        return processAndCacheResponse(body); 
                    }
                })
                .doOnError(error -> logger.error("[RedisCacheFilter] Error accessing cache: ", error));
    }

    /**
     * Processes the response body, serializes it, and caches it in Redis.
     *
     * @param body the response body to process
     * @return a Mono indicating when the write is complete
     */
    private Mono<DataBuffer> processAndCacheResponse(Publisher<? extends DataBuffer> body) {
        return aggregateBody(body)
                .doOnNext(content -> {  // Executes in the background without blocking
                    createCachedResponse(content)
                        .flatMap(cachedResponse -> cacheService.save(cacheKey, cachedResponse, ttl))
                        .doOnError(e -> logger.error("Errore nella serializzazione della risposta per la cache", e))
                        .subscribe();
                })
                .flatMap(content -> {
                    // Create a new DataBuffer for the response
                    DataBuffer newBuffer = getDelegate().bufferFactory().wrap(content);
                    return Mono.just(newBuffer);
                });
    }

    /**
     * Save on Redis a CachedResponse object from the byte array content of the
     * response.
     *
     * @param content the content of the response body
     * @return a Mono containing the CachedResponse object
     */
    private Mono<CachedResponse> createCachedResponse(byte[] content) {
        String responseBody = new String(content, StandardCharsets.UTF_8);
        Map<String, List<String>> headersMap = extractHeaders();
        String status = extractStatusCode().toString();
        return Mono.just(
                new CachedResponse(responseBody, headersMap, status)
        );
    }

    /**
     * Retrieves a cached response from Redis.
     *
     * @param cachedValue the cached response as a string
     * @return a Mono indicating when the write is complete
     */
    public Mono<DataBuffer> writeCachedResponse() {
        return cacheService
                .get(cacheKey)
                .flatMap(cachedValue -> {
                    if (cachedValue == null) {
                        logger.warn("Nessuna risposta trovata in cache per la chiave: {}", cacheKey);
                        return Mono.empty();
                    }

                    // Set headers from cache
                    cachedValue.getHeaders().forEach((key, valueList) -> {
                        getDelegate().getHeaders().put(key, new ArrayList<>(valueList));
                    });

                    // Set HTTP status from cache
                    HttpStatusCode statusCode = HttpStatus.valueOf(cachedValue.getStatusCode());
                    getDelegate().setStatusCode(statusCode);

                    // Create a DataBuffer for the body from the cache
                    DataBuffer buffer = getDelegate()
                            .bufferFactory()
                            .wrap(cachedValue.getBody().getBytes(StandardCharsets.UTF_8));

                    return Mono.just(buffer);
                });
    }

    /**
     * Aggregates the response body into a byte array.
     *
     * @param body the response body to aggregate
     * @return a Mono containing the aggregated byte array
     */
    private Mono<byte[]> aggregateBody(Publisher<? extends DataBuffer> body) {
        return DataBufferUtils
            .join(Flux.from(body))
                .flatMap(buffer -> {
                    try {
                        byte[] content = new byte[buffer.readableByteCount()];
                        buffer.read(content);
                        return Mono.just(content);
                    } finally {
                        DataBufferUtils.release(buffer);  // Release buffer to avoid memory leak
                    }
                });
    }

    /**
     * Extracts the headers from the delegate response.
     *
     * @return a map containing the headers
     */
    private Map<String, List<String>> extractHeaders() {
        Map<String, List<String>> headersMap = new HashMap<>();
        getDelegate().getHeaders().forEach(
                (key, valueList) -> headersMap.put(key, new ArrayList<>(valueList))
        );
        return headersMap;
    }

    /**
     * Extracts the status code from the delegate response.
     *
     * @return the status code of the response, or null if not set
     */
    public HttpStatusCode extractStatusCode() {
        return getDelegate().getStatusCode();
    }
}
