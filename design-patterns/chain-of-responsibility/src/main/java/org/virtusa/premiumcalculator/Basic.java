package org.virtusa.premiumcalculator;

public class Basic extends Handler {
    @Override
    public double addPremium(Policy policy) {
        policy.setPremium(policy.getPremium() + 2000);
        System.out.println("Basic added");
        if (policy.getAge() > 65) {
            return policy.getPremium();
        } else {
            return successor.addPremium(policy);
        }
    }
}
