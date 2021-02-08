package com.lakshan.domainregistry;

import com.lakshan.domainregistry.domain.Domain;
import com.lakshan.domainregistry.domain.DomainTelescopic1;
import com.lakshan.domainregistry.domain.DomainTelescopic2;

public class Application {
    public static void main(String[] args) {
        DomainTelescopic1 domainTelescopic1=new DomainTelescopic1("geek.lk");
        System.out.println(domainTelescopic1);
        System.out.println();

        DomainTelescopic2 domainTelescopic2=new DomainTelescopic2("ict.lk");
        System.out.println(domainTelescopic2);
        System.out.println();

        Domain.Builder builder=new Domain.Builder("lakshan.com");

        Domain domain=builder.numberOfEmail(5).ssl(true).whoIsGuard(false).build();
        System.out.println(domain);
    }
}
