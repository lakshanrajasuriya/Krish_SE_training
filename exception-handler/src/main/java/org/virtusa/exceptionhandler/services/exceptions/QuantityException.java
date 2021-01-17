package org.virtusa.exceptionhandler.services.exceptions;

public class QuantityException extends RuntimeException {
    public QuantityException(String message, Exception exception) {
        super(message, exception);
        System.out.println(message);
    }

}
