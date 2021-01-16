package org.virtusa.exceptionhandler;

import org.virtusa.exceptionhandler.services.commands.CommandService;

public class Application {
    public static void main(String[] args)  {
        System.out.println("Stock Management System\n");
        CommandService commandService=new CommandService();
        commandService.listen();

    }
}
