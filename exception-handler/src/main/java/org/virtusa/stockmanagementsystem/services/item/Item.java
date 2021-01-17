package org.virtusa.stockmanagementsystem.services.item;

import org.virtusa.stockmanagementsystem.services.exceptions.AddStockException;
import org.virtusa.stockmanagementsystem.services.exceptions.DBNotFoundException;
import org.virtusa.stockmanagementsystem.services.stock.Stock;
import org.virtusa.stockmanagementsystem.services.stock.StockImpl;

public class Item {
    private int id;


    public void addToStock() throws AddStockException {
        try {
            Stock stock = new StockImpl();
            stock.addNewItem(1);
        } catch (DBNotFoundException exception) {
            throw new AddStockException("Error: Cannot add item to stock", exception);
        }
    }


}
