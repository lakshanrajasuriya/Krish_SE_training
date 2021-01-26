package org.virtusa.grocerystore.item;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class ItemRegistry {
    private Map<ItemType, Item> items = new HashMap<ItemType, Item>();

    public ItemRegistry() {
        this.initialize();
    }

    public Item getItem(ItemType itemType) {
        Item item = null;
        try {
            item = (Item) items.get(itemType).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return item;
    }

    private void initialize() {
        Chocolate chocolate = new Chocolate();
        chocolate.setPrice(BigDecimal.valueOf(80));
        chocolate.setColor("White");
        chocolate.setItemType("Sweets");


        Milk milk = new Milk();
        milk.setPrice(BigDecimal.valueOf(150));
        milk.setBrand("Nestle");
        milk.setItemType("Dairy");

        Book book = new Book();
        book.setNumberOfPages(100);
        book.setItemType("Stationery");
        book.setPrice(BigDecimal.valueOf(40));

        items.put(ItemType.CHOCOLATE, chocolate);
        items.put(ItemType.MILK, milk);
        items.put(ItemType.BOOK, book);
    }
}
