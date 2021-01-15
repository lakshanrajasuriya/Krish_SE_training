package org.virtusa.exceptionhandler.services.stock;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StockImpl implements Stock{
    int availableStocks;



    public StockImpl() throws StockDBException {
        readFile();
    }

    public int getAvailableStocks() {
        return availableStocks;
    }

    public void reduceStocks(int amount) throws QuantityException, StockDBException {
        if (amount > availableStocks)
            throw new QuantityException("There are not enough stocks!");
        availableStocks = availableStocks - amount;
        writeFile(availableStocks);

    }

    public void addNewStock(int newStock) throws StockDBException {
        availableStocks = availableStocks +newStock;
        writeFile(availableStocks);
    }

    private void readFile() throws StockDBException {
        File file=new File("stock.txt");
        try {
            Scanner scanner=new Scanner(file);
            while (scanner.hasNextLine()){
                availableStocks =scanner.nextInt();
            }
            scanner.close();
        } catch (FileNotFoundException e) {
//            e.printStackTrace();
            throw new StockDBException("Cannot read the file");
        }
    }

    private void writeFile(int newStock) throws StockDBException {
        try {
            FileWriter fileWriter = new FileWriter("stock.txt");
            fileWriter.write(newStock + "");
            fileWriter.close();
        } catch (IOException ioException) {
            throw new StockDBException("Cannot read the file");
        }
    }
    }


