package org.virtusa.exceptionhandler;

import org.virtusa.exceptionhandler.services.commands.CommandService;

public class Application {
    public static void main(String[] args)  {
        CommandService commandService=new CommandService();
        commandService.listen();

    }
}
