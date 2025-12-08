package com.t4.gamerepo.service.exceptions;

public class GameAlreadyClosedException extends RuntimeException {
    public GameAlreadyClosedException(String message) {
        super(message);
    }
}
