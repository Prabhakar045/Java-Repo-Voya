package com.voya.exception.customException;

public class OutOfLimitException extends Exception{

    public OutOfLimitException() {
    }

    public OutOfLimitException(String message) {
        super(message);
    }
}
