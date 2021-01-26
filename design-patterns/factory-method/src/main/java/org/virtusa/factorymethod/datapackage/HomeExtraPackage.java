package org.virtusa.factorymethod.datapackage;

import org.virtusa.factorymethod.service.AnytimeData;
import org.virtusa.factorymethod.service.EmailService;
import org.virtusa.factorymethod.service.SpamProtection;

public class HomeExtraPackage extends Package {
    public void createPackage() {
        services.add(new AnytimeData());
        services.add(new EmailService());
        services.add(new SpamProtection());
    }
}
