package org.virtusa.exceptionhandler.services.stock;

import org.virtusa.exceptionhandler.services.exceptions.QuantityException;
import org.virtusa.exceptionhandler.services.exceptions.StockDBException;

public interface Stock {
    int getAvailableStocks();

    void reduceStocks(int amount) throws QuantityException, StockDBException;

    void addNewItem(int newStock) throws StockDBException;
}
