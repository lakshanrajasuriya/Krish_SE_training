package com.lakshan.premiumcalculator;

public class Policy {
    private int policyNo;
    private double premium;
    private int age;

    public Policy(int policyNo, int age) {
        this.policyNo = policyNo;
        this.age = age;
    }

    public int getPolicyNo() {
        return policyNo;
    }

    public double getPremium() {
        return premium;
    }

    protected void setPremium(double premium) {
        this.premium = premium;
    }

    public int getAge() {
        return age;
    }
}
