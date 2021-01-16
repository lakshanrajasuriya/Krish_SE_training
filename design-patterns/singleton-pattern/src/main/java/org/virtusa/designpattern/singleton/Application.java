package org.virtusa.designpattern.singleton;

import org.virtusa.designpattern.singleton.settings.ConnectionSettings;

public class Application {
    public static void main(String[] args) {
        ConnectionSettings connectionSettings=ConnectionSettings.getConnectionSettings();
        System.out.println(connectionSettings);


        connectionSettings.setUrl("http://localhost:8000");
        connectionSettings.setUserName("lakshan");
        connectionSettings.setPassword("123");
        System.out.println(connectionSettings);

        ConnectionSettings connectionSettings1=ConnectionSettings.getConnectionSettings();
        System.out.println(connectionSettings1);
    }
}
