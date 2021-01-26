package org.virtusa.domainregistry.domain;

public class DomainTelescopic1 {
    String domainName;
    int numberOfEmail;
    Boolean ssl;
    Boolean whoIsGuard;

    public DomainTelescopic1(String domainName) {
        this.domainName = domainName;
    }

    public DomainTelescopic1(String domainName, int numberOfEmail) {
        this(domainName);
        this.numberOfEmail = numberOfEmail;
    }

    public DomainTelescopic1(String domainName, int numberOfEmail, Boolean ssl) {
        this(domainName, numberOfEmail);
        this.ssl = ssl;
    }

    public DomainTelescopic1(String domainName, int numberOfEmail, Boolean ssl, Boolean whoIsGuard) {
        this(domainName, numberOfEmail, ssl);
        this.whoIsGuard = whoIsGuard;
    }

    @Override
    public String toString() {
        return "DomainTelescopic1 {" +
                "domainName='" + domainName + '\'' +
                ", numberOfEmail=" + numberOfEmail +
                ", ssl=" + ssl +
                ", whoIsGuard=" + whoIsGuard +
                '}';
    }
}
