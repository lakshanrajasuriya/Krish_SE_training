package com.lakshan.grocerystore.item;

import java.math.BigDecimal;

public abstract class Item implements Cloneable {
    private BigDecimal price;
    private String itemType;

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
