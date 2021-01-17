package org.virtusa.stockmanagementsystem.services.exceptions;

public class SetVarientException extends Exception {
    public SetVarientException(String message, Exception exception) {
        super(message, exception);
        System.out.println(message);
    }
}
