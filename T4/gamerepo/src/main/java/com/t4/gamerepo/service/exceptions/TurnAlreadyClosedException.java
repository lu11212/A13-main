package com.t4.gamerepo.service.exceptions;

public class TurnAlreadyClosedException extends RuntimeException {
    public TurnAlreadyClosedException(String message) {
        super(message);
    }
}
