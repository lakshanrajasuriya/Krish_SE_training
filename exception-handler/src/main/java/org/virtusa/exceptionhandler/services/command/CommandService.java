package org.virtusa.exceptionhandler.services.command;

import org.virtusa.exceptionhandler.services.exceptions.CommandException;
import org.virtusa.exceptionhandler.services.stock.Stock;
import org.virtusa.exceptionhandler.services.stock.StockImpl;
import org.virtusa.exceptionhandler.services.exceptions.QuantityException;
import org.virtusa.exceptionhandler.services.exceptions.StockDBException;
import org.virtusa.exceptionhandler.services.variant.Variant;

import java.util.Scanner;

public class CommandService {

    public void listen() throws CommandException {
        Scanner scanner = new Scanner(System.in);
        try {
            while (true) {
                System.out.println("Select an option:");
                System.out.println("A - Get Available Stock count, B - Add New Item,  C - Remove an Item, Q - Exit");
                scanner = new Scanner(System.in);
                String selectedOption = scanner.nextLine();
                if (selectedOption.equalsIgnoreCase("a"))
                    getStockCount();
                else if (selectedOption.equalsIgnoreCase("b"))
                    addItem();
                else if (selectedOption.equalsIgnoreCase("c"))
                    removeItem();
                else if (selectedOption.equalsIgnoreCase("q"))
                    System.exit(0);
                else
                    System.out.println("Invalid Command");

            }
        } catch (Exception exception) {
//            throw new RuntimeException("Error: Command service", exception);
            throw new CommandException("Error: Command service failed", exception);
        }
    }

    private void addItem() throws CommandException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Item type: ");
        String itemType = scanner.nextLine();

        System.out.println("Item length: ");
        String itemLength = scanner.nextLine();

        System.out.println("Item color: ");
        String itemColor = scanner.nextLine();

        try {
            Variant variant = new Variant(itemType, itemLength, itemColor);
            variant.addItem();
            System.out.println("Item added!\n");
            getStockCount();

        } catch (Exception e) {
            throw new CommandException("Error: Failed to add new item", e);
//            System.out.println("Error: "+e.getMessage());
//            e.printStackTrace();
        }
    }

    private void removeItem() throws QuantityException {
        try {
            Stock stock = new StockImpl();
            stock.reduceStocks(1);
            getStockCount();
        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("Error: "+e.getMessage());
            throw new QuantityException("Error: cannot remove item", e);
        }

    }

    private void getStockCount() throws StockDBException, CommandException {
        try {
            Stock stock = new StockImpl();
//            stock.reduceStocks(stockCount);
            System.out.println("Available Stock:" + stock.getAvailableStocks());
        } catch (Exception e) {
            throw new StockDBException("Error: Cannot get available stock", e);
//            System.out.println("Error: "+e.getMessage());
//            e.printStackTrace();
        }
    }
}
