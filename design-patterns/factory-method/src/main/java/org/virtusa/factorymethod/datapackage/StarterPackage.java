package org.virtusa.factorymethod.datapackage;

import org.virtusa.factorymethod.service.AnytimeData;

public class StarterPackage extends Package {
    public void createPackage() {
        services.add(new AnytimeData());
    }
}
