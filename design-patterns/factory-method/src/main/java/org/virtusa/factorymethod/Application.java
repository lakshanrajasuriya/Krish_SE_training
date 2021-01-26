package org.virtusa.factorymethod;

import org.virtusa.factorymethod.datapackage.Package;
import org.virtusa.factorymethod.datapackage.PackageCode;
import org.virtusa.factorymethod.datapackage.PackageFactory;

public class Application {
    public static void main(String[] args) {
        Package starterPackage = PackageFactory.createPackage(PackageCode.STARTER);
        System.out.println(starterPackage + "\n");

        Package homePackage = PackageFactory.createPackage(PackageCode.HOME);
        System.out.println(homePackage + "\n");

        Package homeExtraPackage = PackageFactory.createPackage(PackageCode.HOMEEXTRA);
        System.out.println(homeExtraPackage + "\n");

        Package webPackage = PackageFactory.createPackage(PackageCode.WEBMAX);
        System.out.println(webPackage + "\n");
    }
}
