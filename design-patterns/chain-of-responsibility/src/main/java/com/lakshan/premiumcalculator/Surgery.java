package com.lakshan.premiumcalculator;

public class Surgery extends Handler {
    @Override
    public double addPremium(Policy policy) {
        policy.setPremium(policy.getPremium() + 1000);
        System.out.println("Surgery added");
        if (policy.getAge() <= 40) {
            return successor.addPremium(policy);
        } else {
            return policy.getPremium();
        }
    }
}
