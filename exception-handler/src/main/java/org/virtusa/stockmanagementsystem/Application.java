package org.virtusa.stockmanagementsystem;

import org.virtusa.stockmanagementsystem.services.command.CommandService;
import org.virtusa.stockmanagementsystem.services.exceptions.AddItemException;
import org.virtusa.stockmanagementsystem.services.exceptions.DBNotFoundException;
import org.virtusa.stockmanagementsystem.services.exceptions.RemoveItemException;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("Stock Management System\n");
        Scanner scanner = new Scanner(System.in);
        CommandService commandService = new CommandService();

        try {
            while (true) {
                System.out.println("Select an option:");
                System.out.println("A - Get Available Stock count, B - Add New Item,  C - Remove an Item, D - Modify Item, Q - Exit");

                String selectedOption = scanner.nextLine();
                if (selectedOption.equalsIgnoreCase("a"))
                    commandService.getStockCount();
                else if (selectedOption.equalsIgnoreCase("b"))
                    commandService.addItem();
                else if (selectedOption.equalsIgnoreCase("c"))
                    commandService.removeItem();
                else if (selectedOption.equalsIgnoreCase("d"))
                    commandService.modifyItem();
                else if (selectedOption.equalsIgnoreCase("q"))
                    System.exit(0);
                else
                    System.out.println("Invalid Command");

            }
        } catch (DBNotFoundException e) {
            System.out.println(e);
        } catch (AddItemException e) {
            e.printStackTrace();
        } catch (RemoveItemException e) {
            System.out.println(e);
        }
    }
}
