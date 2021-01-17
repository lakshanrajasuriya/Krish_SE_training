package org.virtusa.stockmanagementsystem.services.exceptions;

public class RemoveItemException extends Exception {
    public RemoveItemException(String message, Exception exception) {
        super(message,exception);
    }
}
