package org.virtusa.stockmanagementsystem.services.exceptions;

public class QuantityExceedException extends RuntimeException {
    public QuantityExceedException(String message, Exception exception) {
        super(message, exception);
        System.out.println(message);
    }

}
