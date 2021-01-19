package org.virtusa.designpattern.factorymethod;

import java.util.ArrayList;
import java.util.List;

public abstract class Package {
    protected List<Service> services=new ArrayList<Service>();

    public Package() {
        createPackage();
    }

    public abstract void createPackage();

    @Override
    public String toString() {
        return "Package{" +
                "services=" + services +
                '}';
    }
}
