package org.virtusa.exceptionhandler.services.commands;

import org.virtusa.exceptionhandler.services.stock.QuantityException;
import org.virtusa.exceptionhandler.services.stock.Stock;
import org.virtusa.exceptionhandler.services.stock.StockDBException;
import org.virtusa.exceptionhandler.services.stock.StockImpl;

import java.util.Scanner;

public class CommandService {
    Scanner scanner;
    public void listen()  {
        scanner= new Scanner(System.in);
        while (true){
            System.out.println("Select an option:");
            System.out.println("A - Get Stock,  B - Add Stock, Q - Exit");
            Scanner scanner=new Scanner(System.in);
            String selectedOption=scanner.nextLine();
            if(selectedOption.equalsIgnoreCase("a"))
                getStock();
            else if(selectedOption.equalsIgnoreCase("b"))
                addStock();
            else if(selectedOption.equalsIgnoreCase("q"))
                System.exit(0);
            else
                System.out.println("Invalid Command");

        }
    }

    private void getStock()  {
        System.out.println("Enter the stock amount you need: ");
        int stockCount=scanner.nextInt();
        try {
            Stock stock=new StockImpl();
            stock.reduceStocks(stockCount);
            System.out.println("Available Stock:"+stock.getAvailableStocks());
        } catch (QuantityException e) {
            System.out.println("Error: "+e.getMessage());
//            e.printStackTrace();
        } catch (StockDBException e) {
            System.out.println("Error: "+e.getMessage());
//            e.printStackTrace();
        }
    }

    private void addStock()  {
        System.out.println("Enter the Stock amount to add: ");
        int stockCount=scanner.nextInt();
        try {
            Stock stock=new StockImpl();
            stock.addNewStock(stockCount);
            System.out.println("Available Stock:"+stock.getAvailableStocks());
        } catch (StockDBException e) {
//            e.printStackTrace();
            System.out.println("Error: "+e.getMessage());
        }

    }
}
