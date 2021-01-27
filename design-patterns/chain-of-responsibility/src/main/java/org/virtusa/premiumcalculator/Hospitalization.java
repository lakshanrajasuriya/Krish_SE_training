package org.virtusa.premiumcalculator;

public class Hospitalization extends Handler {
    @Override
    public double addPremium(Policy policy) {
        policy.setPremium(policy.getPremium() + 1000);
        System.out.println("Hospitalization added");
        if (policy.getAge() <= 50) {
            return successor.addPremium(policy);
        } else {
            return policy.getPremium();
        }
    }
}
