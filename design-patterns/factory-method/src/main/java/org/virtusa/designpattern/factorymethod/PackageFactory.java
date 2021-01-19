package org.virtusa.designpattern.factorymethod;

public class PackageFactory {
    public static Package createPackage(PackageCode packageCode) {
        switch (packageCode) {
            case STARTER:
                return new StarterPackage();
            case HOME:
                return new HomePackage();
            case HOMEEXTRA:
                return new HomeExtraPackage();
            case WEBMAX:
                return new WebMaxPackage();
            default:
                return null;
        }
    }
}
