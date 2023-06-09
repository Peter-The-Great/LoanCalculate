package org.pjotr.loans;

public class HomeLoan extends Loan {
    public HomeLoan() {
        setName("Home");
        setRate(10.5);
    }

    @Override
    protected double calculateInterest(double loanAmount) {
        return getRate() / 1200;
    }

    @Override
    protected double calculateEMI(double loanAmount, double rate, int years) {
        System.out.println(rate);
        System.out.println(loanAmount);
        System.out.println((rate * Math.pow((1 + rate), years)));

        return (rate * Math.pow((1 + rate), years) / (Math.pow((1 + rate), years) - 1)) * loanAmount;
    }
}
