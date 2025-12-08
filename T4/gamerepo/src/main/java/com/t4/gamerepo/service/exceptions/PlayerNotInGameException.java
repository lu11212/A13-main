package com.t4.gamerepo.service.exceptions;

public class PlayerNotInGameException extends RuntimeException {
    public PlayerNotInGameException(String message) {
        super(message);
    }
}
