package com.lakshan.factorymethod.datapackage;

import com.lakshan.factorymethod.service.AnytimeData;
import com.lakshan.factorymethod.service.EmailService;

public class HomePackage extends Package {
    public void createPackage() {
        services.add(new AnytimeData());
        services.add(new EmailService());
    }
}
