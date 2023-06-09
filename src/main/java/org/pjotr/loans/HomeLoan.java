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
        int n = years * 12;
        return (rate * Math.pow((1 + rate), n) / (Math.pow((1 + rate), n) - 1)) * loanAmount;
    }
}
