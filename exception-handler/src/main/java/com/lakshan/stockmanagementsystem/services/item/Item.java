package com.lakshan.stockmanagementsystem.services.item;

import com.lakshan.stockmanagementsystem.services.exceptions.AddStockException;
import com.lakshan.stockmanagementsystem.services.exceptions.DBNotFoundException;
import com.lakshan.stockmanagementsystem.services.stock.Stock;
import com.lakshan.stockmanagementsystem.services.stock.StockImpl;

public class Item {
    private int id;


    public void addToStock() throws AddStockException {
        try {
            Stock stock = new StockImpl();
            stock.addNewItem(1);
        } catch (DBNotFoundException exception) {
            throw new AddStockException("Error: Failed to add item to the Stock", exception);
        }
    }


}
