package org.virtusa.stockmanagementsystem.services.exceptions;

public class AddItemException extends Exception {
    public AddItemException(String message,Exception exception) {
        super(message,exception);
    }
}
