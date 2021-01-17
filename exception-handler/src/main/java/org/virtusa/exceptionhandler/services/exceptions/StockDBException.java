package org.virtusa.exceptionhandler.services.exceptions;

public class StockDBException extends Exception {
    public StockDBException(String message, Exception exception) {
        super(message, exception);
        System.out.println(message);
    }
}
