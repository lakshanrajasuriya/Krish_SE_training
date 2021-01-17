package org.virtusa.stockmanagementsystem.services.stock;

import org.virtusa.stockmanagementsystem.services.exceptions.QuantityExceedException;
import org.virtusa.stockmanagementsystem.services.exceptions.DBNotFoundException;

public interface Stock {
    int getAvailableStocks();

    void reduceStocks(int amount) throws QuantityExceedException, DBNotFoundException;

    void addNewItem(int newStock) throws DBNotFoundException;
}
