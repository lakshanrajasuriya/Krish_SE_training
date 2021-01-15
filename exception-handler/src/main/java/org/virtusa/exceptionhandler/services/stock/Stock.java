package org.virtusa.exceptionhandler.services.stock;

public interface Stock {
    int getAvailableStocks();
    void reduceStocks(int amount) throws QuantityException, StockDBException;
    void addNewStock(int newStock) throws StockDBException;
}
