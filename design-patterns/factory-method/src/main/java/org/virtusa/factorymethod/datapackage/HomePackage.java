package org.virtusa.factorymethod.datapackage;

import org.virtusa.factorymethod.service.AnytimeData;
import org.virtusa.factorymethod.service.EmailService;

public class HomePackage extends Package {
    public void createPackage() {
        services.add(new AnytimeData());
        services.add(new EmailService());
    }
}
