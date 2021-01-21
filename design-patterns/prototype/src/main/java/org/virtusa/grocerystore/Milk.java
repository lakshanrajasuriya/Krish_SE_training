package org.virtusa.grocerystore;

public class Milk extends Item {
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Milk {" +
                "brand = '" + brand + '\'' +
                '}';
    }
}
