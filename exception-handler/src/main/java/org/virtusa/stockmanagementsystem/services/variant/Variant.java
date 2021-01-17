package org.virtusa.stockmanagementsystem.services.variant;

import org.virtusa.stockmanagementsystem.services.exceptions.AddStockException;
import org.virtusa.stockmanagementsystem.services.exceptions.OverLengthException;
import org.virtusa.stockmanagementsystem.services.exceptions.SetVarientException;
import org.virtusa.stockmanagementsystem.services.item.Item;

public class Variant {
    private String type;
    private int length;
    private String color;

    public Variant(String type, int length, String color) {
        this.type = type;
        this.length = length;
        this.color = color;
    }

    public Variant(){

    }

    public void setVariant() throws SetVarientException {
        try {
            Item item = new Item();
            item.addToStock();
        } catch (AddStockException exception) {
            throw new SetVarientException("Error: Failed to set variant", exception);
        }
    }

    public void changeVariant(int itemId, String type, int length, String color) {
        if (length > 24) {
            try {
                throw new OverLengthException("Length Cannot be more than 24");
            } catch (OverLengthException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
