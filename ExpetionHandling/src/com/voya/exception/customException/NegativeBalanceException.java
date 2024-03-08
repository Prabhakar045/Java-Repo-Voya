package com.voya.exception.customException;

public class NegativeBalanceException extends Exception{

    public NegativeBalanceException() {
    }

    public NegativeBalanceException(String message) {
        super(message);
    }
}
