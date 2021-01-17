package org.virtusa.exceptionhandler.services.variant;

import org.virtusa.exceptionhandler.services.item.Item;
import org.virtusa.exceptionhandler.services.item.ItemException;

public class Variant {
    private String type;
    private String length;
    private String color;

    public Variant(String type, String length, String color) {
        this.type = type;
        this.length = length;
        this.color = color;
    }

    public void addItem() throws ItemException {
        try {
            Item item = new Item();
            item.addToStock();
        } catch (Exception exception) {
            throw new ItemException("Error: Failed to add data", exception);
        }


    }
}
