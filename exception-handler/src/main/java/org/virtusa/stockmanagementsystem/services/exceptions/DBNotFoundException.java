package org.virtusa.stockmanagementsystem.services.exceptions;

public class DBNotFoundException extends Exception {
    public DBNotFoundException(String message, Exception exception) {
        super(message, exception);
    }
}
