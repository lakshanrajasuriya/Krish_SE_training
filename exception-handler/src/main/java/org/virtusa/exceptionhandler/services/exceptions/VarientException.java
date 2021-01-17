package org.virtusa.exceptionhandler.services.exceptions;

public class VarientException extends Exception {
    public VarientException(String message, Exception exception) {
        super(message, exception);
        System.out.println(message);
    }
}
