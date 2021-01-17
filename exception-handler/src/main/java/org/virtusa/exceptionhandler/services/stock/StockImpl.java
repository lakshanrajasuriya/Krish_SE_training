package org.virtusa.exceptionhandler.services.stock;

import org.virtusa.exceptionhandler.services.exceptions.QuantityException;
import org.virtusa.exceptionhandler.services.exceptions.StockDBException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StockImpl implements Stock {
    //    private
    int availableStocks;


    public StockImpl() throws StockDBException {
        readFile();
    }

    public int getAvailableStocks() {
        return availableStocks;
    }

    public void reduceStocks(int stockCount) throws QuantityException, StockDBException {
        if (stockCount > availableStocks)
            throw new QuantityException("Error: Not enough stocks!", null);
        availableStocks = availableStocks - stockCount;
        writeFile(availableStocks);

    }

    public void addNewItem(int newStockCount) throws StockDBException {
        availableStocks = availableStocks + newStockCount;
        writeFile(availableStocks);
    }

    private void readFile() throws StockDBException {
        File file = new File("stock.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                availableStocks=Integer.parseInt(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
//            e.printStackTrace();
            throw new StockDBException("Error: Stock file not found", e);
        }
    }

    private void writeFile(int newStock) throws StockDBException {
        try {
            FileWriter fileWriter = new FileWriter("stock.txt");
            fileWriter.write(newStock + "");
            fileWriter.close();
        } catch (IOException ioException) {
            throw new StockDBException("Error: Stock file not found", ioException);
        }
    }
}


