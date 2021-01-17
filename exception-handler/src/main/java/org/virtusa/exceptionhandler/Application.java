package org.virtusa.exceptionhandler;

import org.virtusa.exceptionhandler.services.command.CommandService;
import org.virtusa.exceptionhandler.services.exceptions.CommandException;

public class Application {
    public static void main(String[] args) {
        System.out.println("Stock Management System\n");
        CommandService commandService = new CommandService();
        try {
            commandService.listen();
        } catch (CommandException e) {
            e.printStackTrace();

            // log error without stack trace
            /*StringWriter stringWriter=new StringWriter();
            PrintWriter printWriter=new PrintWriter(stringWriter);
            e.printStackTrace(printWriter);
            String stackTraceAsString=stringWriter.toString();
            System.out.println(stackTraceAsString);*/
        }
    }
}
