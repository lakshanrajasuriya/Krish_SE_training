package org.virtusa.premiumcalculator;

public class Premium extends Handler {
    @Override
    public double addPremium(Policy policy) {
        return successor.addPremium(policy);
    }
}
