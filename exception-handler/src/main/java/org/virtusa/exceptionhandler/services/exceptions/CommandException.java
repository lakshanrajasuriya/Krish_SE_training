package org.virtusa.exceptionhandler.services.exceptions;

public class CommandException extends Exception {
    public CommandException(String message, Exception exception) {
        super(message, exception);
        System.out.println(message);
    }
}
