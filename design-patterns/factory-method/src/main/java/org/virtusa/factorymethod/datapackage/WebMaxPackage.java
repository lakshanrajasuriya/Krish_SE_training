package org.virtusa.factorymethod.datapackage;

import org.virtusa.factorymethod.service.AnytimeData;
import org.virtusa.factorymethod.service.CloudStorage;
import org.virtusa.factorymethod.service.EmailService;
import org.virtusa.factorymethod.service.SpamProtection;

public class WebMaxPackage extends Package {
    public void createPackage() {
        services.add(new AnytimeData());
        services.add(new EmailService());
        services.add(new SpamProtection());
        services.add(new CloudStorage());
    }
}
