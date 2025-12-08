package com.t4.gamerepo.service.exceptions;

public class DuplicatedPlayersInGameException extends RuntimeException {
    public DuplicatedPlayersInGameException(String message) {
        super(message);
    }
}
