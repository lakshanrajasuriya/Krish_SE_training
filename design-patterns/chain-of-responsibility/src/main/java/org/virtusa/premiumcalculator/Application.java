package org.virtusa.premiumcalculator;

public class Application {
    public static void main(String[] args) {
        Basic basic = new Basic();
        Hospitalization hospitalization = new Hospitalization();
        Surgery surgery = new Surgery();
        ChildBirth childBirth = new ChildBirth();
        Premium premium = new Premium();

        premium.setSuccessor(basic);
        basic.setSuccessor(hospitalization);
        hospitalization.setSuccessor(surgery);
        surgery.setSuccessor(childBirth);

        Policy policy = new Policy(6043, 66);
        System.out.println(premium.addPremium(policy));
        System.out.println();

        Policy policy1 = new Policy(3423, 52);
        System.out.println(premium.addPremium(policy1));
        System.out.println();

        Policy policy2 = new Policy(4423, 41);
        System.out.println(premium.addPremium(policy2));
        System.out.println();

        Policy policy3 = new Policy(5423, 33);
        System.out.println(premium.addPremium(policy3));
    }
}
