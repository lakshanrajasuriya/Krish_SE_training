package org.virtusa.exceptionhandler.services.item;

public class ItemException extends Exception {
    public ItemException(String message, Exception exception) {
        super(message, exception);
        System.out.println(message);
    }
}
