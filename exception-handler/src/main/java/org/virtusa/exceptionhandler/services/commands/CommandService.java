package org.virtusa.exceptionhandler.services.commands;

import org.virtusa.exceptionhandler.services.stock.QuantityException;
import org.virtusa.exceptionhandler.services.stock.Stock;
import org.virtusa.exceptionhandler.services.stock.StockDBException;
import org.virtusa.exceptionhandler.services.stock.StockImpl;

import java.util.Scanner;

public class CommandService {
    Scanner scanner;
    public void listen() {
        scanner= new Scanner(System.in);
        while (true){
            System.out.println("What do you want? ");
            System.out.println("A - Reduce,  B - Add, Q - Quit");
            Scanner scanner=new Scanner(System.in);
            String choice=scanner.nextLine();
            if(choice.equalsIgnoreCase("a"))
            loopReduce();
            else if(choice.equalsIgnoreCase("b"))
                loopAdd();
            else if(choice.equalsIgnoreCase("q"))
                System.exit(0);
            else
                System.out.println("Invalid Command");

        }
    }

    private void loopReduce()  {
        System.out.println("Enter Stock amount need: ");
        int need=scanner.nextInt();
        try {
            Stock stock=new StockImpl();
            stock.reduceStocks(need);
            System.out.println("Available Stock:"+stock.getAvailableStocks());
        } catch (QuantityException e) {
            System.out.println("Error: "+e.getMessage());
            e.printStackTrace();
        } catch (StockDBException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }

    private void loopAdd()  {
        System.out.println("Enter Stock amount to add: ");
        int need=scanner.nextInt();
        try {
            Stock stock=new StockImpl();
            stock.addNewStock(need);
            System.out.println("Available Stock:"+stock.getAvailableStocks());
        } catch (StockDBException e) {
//            e.printStackTrace();
            System.out.println("Error: "+e.getMessage());
        }

    }
}
