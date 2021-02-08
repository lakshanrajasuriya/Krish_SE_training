package com.lakshan.premiumcalculator;

public class ChildBirth extends Handler {
    @Override
    public double addPremium(Policy policy) {
        policy.setPremium(policy.getPremium() + 1000);
        System.out.println("Child birth added");
        return policy.getPremium();
    }
}
