package com.t4.gamerepo.service.exceptions;

public class RoundAlreadyClosedException extends RuntimeException {
    public RoundAlreadyClosedException(String message) {
        super(message);
    }
}
