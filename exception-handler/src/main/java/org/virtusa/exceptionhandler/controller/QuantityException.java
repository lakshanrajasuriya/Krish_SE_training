package org.virtusa.exceptionhandler.controller;

public class QuantityException extends Exception{
    public QuantityException(String message){
        System.out.println(message);
    }

}
