package org.virtusa.grocerystore.item;

public class Chocolate extends Item {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Chocolate {" +
                "color = '" + color + '\'' +
                '}';
    }
}
