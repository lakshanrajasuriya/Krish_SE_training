package org.virtusa.designpattern.factorymethod;

public class WebMaxPackage extends Package {
    public void createPackage() {
        services.add(new AnytimeData());
        services.add(new EmailService());
        services.add(new SpamProtection());
        services.add(new CloudStorage());
    }
}