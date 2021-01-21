package org.virtusa.grocerystore;

public class Application {
    public static void main(String[] args) {
        ItemRegistry itemRegistry = new ItemRegistry();

        Chocolate chocolate = (Chocolate) itemRegistry.getItem(ItemType.CHOCOLATE);
        System.out.println("New Item: " + chocolate);
        chocolate.setColor("Black");
        System.out.println("Updated Item: " + chocolate);
        Chocolate chocolate1 = (Chocolate) itemRegistry.getItem(ItemType.CHOCOLATE);
        System.out.println("New Item: " + chocolate1);
        System.out.println("\n");

        Milk milk = (Milk) itemRegistry.getItem(ItemType.MILK);
        System.out.println("New Item: " + milk);
        System.out.println("\n");


        Book book = (Book) itemRegistry.getItem(ItemType.BOOK);
        System.out.println("New Item: " + book);
        book.setNumberOfPages(120);
        System.out.println("Updated Item: " + book);
        Book book2 = (Book) itemRegistry.getItem(ItemType.BOOK);
        System.out.println("New Item: " + book2);
    }
}
