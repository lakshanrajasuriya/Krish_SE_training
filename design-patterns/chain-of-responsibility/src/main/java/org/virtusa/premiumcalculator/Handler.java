package org.virtusa.premiumcalculator;

public abstract class Handler {
    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract double addPremium(Policy policy);
}
