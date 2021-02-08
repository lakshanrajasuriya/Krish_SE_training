package com.lakshan.stockmanagementsystem.services.variant;

import com.lakshan.stockmanagementsystem.services.exceptions.ChangeVariantException;
import com.lakshan.stockmanagementsystem.services.exceptions.AddStockException;
import com.lakshan.stockmanagementsystem.services.exceptions.OverLengthException;
import com.lakshan.stockmanagementsystem.services.exceptions.SetVariantException;
import com.lakshan.stockmanagementsystem.services.item.Item;

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

    public void setVariant() throws SetVariantException {
        try {
            Item item = new Item();
            item.addToStock();
        } catch (AddStockException exception) {
            throw new SetVariantException("Error: Failed to set variant", exception);
        }
    }

    public void changeVariant(int itemId, String type, int length, String color) {
        if (length > 24) {
            try {
                throw new OverLengthException("Error: Length Cannot be more than 24");
            } catch (OverLengthException e) {
                throw new ChangeVariantException("Error: Cannot change variant",e);
            }

        }
    }
}
