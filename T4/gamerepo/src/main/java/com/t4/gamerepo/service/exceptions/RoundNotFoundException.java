package com.t4.gamerepo.service.exceptions;

public class RoundNotFoundException extends RuntimeException {
    public RoundNotFoundException(String message) {
        super(message);
    }
}
