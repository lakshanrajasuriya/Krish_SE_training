package com.lakshan.factorymethod;

import com.lakshan.factorymethod.datapackage.PackageFactory;
import com.lakshan.factorymethod.datapackage.Package;
import com.lakshan.factorymethod.datapackage.PackageCode;

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
