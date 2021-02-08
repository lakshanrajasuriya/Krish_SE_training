package com.lakshan.singleton;

import com.lakshan.singleton.settings.ConnectionSettings;

public class Application {
    public static void main(String[] args) {
        ConnectionSettings connectionSettings = ConnectionSettings.getConnectionSettings();
        System.out.println(connectionSettings+"\n");


        connectionSettings.setUrl("http://localhost:8000");
        connectionSettings.setUserName("lakshan");
        connectionSettings.setPassword("123");
        System.out.println(connectionSettings+"\n");


        ConnectionSettings connectionSettings1 = ConnectionSettings.getConnectionSettings();
        System.out.println(connectionSettings1);
    }
}
