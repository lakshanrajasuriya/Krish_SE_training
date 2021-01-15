package org.virtusa.exceptionhandler.services.stock;

import java.io.FileNotFoundException;

public class StockDBException extends FileNotFoundException {
    public StockDBException(String message) {
        super(message);
        System.out.println(message);
    }
}
