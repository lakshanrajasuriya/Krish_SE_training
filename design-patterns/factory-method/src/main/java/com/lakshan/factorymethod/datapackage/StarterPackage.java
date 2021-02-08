package com.lakshan.factorymethod.datapackage;

import com.lakshan.factorymethod.service.AnytimeData;

public class StarterPackage extends Package {
    public void createPackage() {
        services.add(new AnytimeData());
    }
}
