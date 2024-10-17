package com.hexaware.bankingsys.task12_13;

public class InsufficientFundException extends Exception {
    private static final long serialVersionUID = 1L;
    
    public InsufficientFundException(String message) {
        super(message);
    }
}