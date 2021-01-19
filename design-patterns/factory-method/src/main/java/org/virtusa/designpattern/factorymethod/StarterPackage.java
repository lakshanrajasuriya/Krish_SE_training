package org.virtusa.designpattern.factorymethod;

public class StarterPackage extends Package {
    public void createPackage() {
        services.add(new AnytimeData());
    }
}
