package com.voya.userapp.exception;

public class TooShortException extends Throwable {
    public TooShortException() {
    }

    public TooShortException(String message) {
        super(message);
    }
}
