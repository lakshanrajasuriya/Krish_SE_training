package org.virtusa.exceptionhandler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.print("Enter the stock amount need: ");
        Scanner scanner=new Scanner(System.in);

        File file=new File("D:\\Programming\\Virtusa\\Krish Java Program\\4 Day\\Task\\New\\stock.txt");
        int data;
        try {
            Scanner scanner1=new Scanner(file);
            while (scanner1.hasNextLine()){
                data=scanner1.nextInt();
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
