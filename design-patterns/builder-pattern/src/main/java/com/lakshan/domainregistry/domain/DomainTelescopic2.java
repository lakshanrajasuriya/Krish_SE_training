package com.lakshan.domainregistry.domain;

public class DomainTelescopic2 {
    String domainName;
    int numberOfEmail;
    Boolean ssl;
    Boolean whoIsGuard;

    public DomainTelescopic2(String domainName, int numberOfEmail, Boolean ssl, Boolean whoIsGuard) {
        this.domainName = domainName;
        this.numberOfEmail = numberOfEmail;
        this.ssl = ssl;
        this.whoIsGuard = whoIsGuard;
    }

    public DomainTelescopic2(String domainName, int numberOfEmail, Boolean ssl) {
        this(domainName, numberOfEmail, ssl, null);
    }

    public DomainTelescopic2(String domainName, int numberOfEmail) {
        this(domainName, numberOfEmail, null);
    }

    public DomainTelescopic2(String domainName) {
        this(domainName, 0);
    }

    @Override
    public String toString() {
        return "DomainTelescopic2 {" +
                "domainName='" + domainName + '\'' +
                ", numberOfEmail=" + numberOfEmail +
                ", ssl=" + ssl +
                ", whoIsGuard=" + whoIsGuard +
                '}';
    }
}
