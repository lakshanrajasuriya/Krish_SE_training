package com.lakshan.stockmanagementsystem.services.stock;

import com.lakshan.stockmanagementsystem.services.exceptions.DBNotFoundException;
import com.lakshan.stockmanagementsystem.services.exceptions.QuantityExceedException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StockImpl implements Stock {
    int availableStocks;


    public StockImpl() throws DBNotFoundException {
        readFile();
    }

    public int getAvailableStocks() {
        return availableStocks;
    }

    public void reduceStocks(int stockCount) throws DBNotFoundException {
        if (stockCount > availableStocks)
            throw new QuantityExceedException("Error: Not enough stocks!");
        availableStocks = availableStocks - stockCount;
        writeFile(availableStocks);

    }

    public void addNewItem(int newStockCount) throws DBNotFoundException {
        availableStocks = availableStocks + newStockCount;
        writeFile(availableStocks);
    }

    private void readFile() throws DBNotFoundException {
        File file = new File("stock.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                availableStocks=Integer.parseInt(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new DBNotFoundException("Error: Stock file not found", e);
        }
    }

    private void writeFile(int newStock) throws DBNotFoundException {
        try {
            FileWriter fileWriter = new FileWriter("stock.txt");
            fileWriter.write(newStock + "");
            fileWriter.close();
        } catch (IOException ioException) {
            throw new DBNotFoundException("Error: Stock file not found", ioException);
        }
    }
}


