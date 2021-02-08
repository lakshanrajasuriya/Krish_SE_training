package com.lakshan.stockmanagementsystem.services.exceptions;

public class ChangeVariantException extends RuntimeException {
    public ChangeVariantException(String message, Exception exception) {
        super(message, exception);
    }
}
