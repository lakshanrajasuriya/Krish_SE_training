package com.lakshan.stockmanagementsystem.services.exceptions;

public class SetVariantException extends Exception {
    public SetVariantException(String message, Exception exception) {
        super(message, exception);
    }
}
