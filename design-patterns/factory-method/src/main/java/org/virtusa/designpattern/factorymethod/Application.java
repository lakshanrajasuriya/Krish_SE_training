package org.virtusa.designpattern.factorymethod;

public class Application {
    public static void main(String[] args) {
        Package starterPackage=PackageFactory.createPackage(PackageCode.STARTER);
        System.out.println(starterPackage);

        Package homePackage=PackageFactory.createPackage(PackageCode.HOME);
        System.out.println(homePackage);

        Package homeExtraPackage=PackageFactory.createPackage(PackageCode.HOMEEXTRA);
        System.out.println(homeExtraPackage);

        Package webPackage=PackageFactory.createPackage(PackageCode.WEBMAX);
        System.out.println(webPackage);
    }
}
