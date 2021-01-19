package org.virtusa.designpattern.factorymethod;

public class HomePackage extends Package {
    public void createPackage() {
        services.add(new AnytimeData());
        services.add(new EmailService());
    }
}
