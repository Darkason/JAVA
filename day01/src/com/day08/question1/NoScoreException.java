package com.day08.question1;

public class NoScoreException extends RuntimeException {
    public NoScoreException(String message) {
        super(message);
    }

    public NoScoreException() {
    }
}
