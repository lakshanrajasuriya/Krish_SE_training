package org.virtusa.exceptionhandler.services.item;

import org.virtusa.exceptionhandler.services.stock.Stock;
import org.virtusa.exceptionhandler.services.stock.StockImpl;
import org.virtusa.exceptionhandler.services.variant.VarientException;

public class Item {
    private int id;


    public void addToStock() throws VarientException {
        try {
            Stock stock = new StockImpl();
            stock.addNewItem(1);
        } catch (Exception exception) {
            throw new VarientException("Error: Cannot add item to stock", exception);
        }
    }


}
