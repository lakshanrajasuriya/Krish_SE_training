package com.lakshan.stockmanagementsystem.services.exceptions;

public class AddStockException extends Exception {
    public AddStockException(String message, Exception exception) {
        super(message, exception);
    }
}
