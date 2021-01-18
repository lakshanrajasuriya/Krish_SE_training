package org.virtusa.stockmanagementsystem.services.command;

import org.virtusa.stockmanagementsystem.services.exceptions.*;
import org.virtusa.stockmanagementsystem.services.stock.Stock;
import org.virtusa.stockmanagementsystem.services.stock.StockImpl;
import org.virtusa.stockmanagementsystem.services.variant.Variant;

import java.util.Scanner;

public class CommandService {

    public void addItem() throws AddItemException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Item type: ");
        String itemType = scanner.nextLine();

        System.out.println("Item length: ");
        int itemLength=scanner.nextInt();
        scanner.nextLine();

        System.out.println("Item color: ");
        String itemColor = scanner.nextLine();

        try {
            Variant variant = new Variant(itemType, itemLength, itemColor);
            variant.setVariant();
            System.out.println("Item added!");

        } catch (SetVariantException e) {
            throw new AddItemException("Error: Failed to create new item", e);
        }
    }

    public void removeItem() throws RemoveItemException {
        try {
            Stock stock = new StockImpl();
            stock.reduceStocks(1);
            getStockCount();
        } catch (DBNotFoundException e) {
            throw new RemoveItemException("Error: Failed to remove the item", e);
        }

    }

    public void getStockCount() throws DBNotFoundException {
        try {
            Stock stock = new StockImpl();
            System.out.println("Available Stock:" + stock.getAvailableStocks());
        } catch (DBNotFoundException e) {
            throw new DBNotFoundException("Error: Cannot get available stock", e);
        }
    }

    public void modifyItem() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Item id: ");
        int itemId = Integer.parseInt(scanner.nextLine());

        System.out.println("Item type: ");
        String itemType = scanner.nextLine();

        System.out.println("Item length: ");
        int itemLength = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Item color: ");
        String itemColor = scanner.nextLine();

        Variant variant = new Variant();
        variant.changeVariant(itemId,itemType,itemLength,itemColor);
        System.out.println("Item modified Successfully!");
    }
}
