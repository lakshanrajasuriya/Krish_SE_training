package com.lakshan.stockmanagementsystem.services.stock;

import com.lakshan.stockmanagementsystem.services.exceptions.DBNotFoundException;
import com.lakshan.stockmanagementsystem.services.exceptions.QuantityExceedException;

public interface Stock {
    int getAvailableStocks();

    void reduceStocks(int amount) throws QuantityExceedException, DBNotFoundException;

    void addNewItem(int newStock) throws DBNotFoundException;
}
