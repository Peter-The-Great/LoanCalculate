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
        return (rate * Math.pow((1 + rate), years * 12) / (Math.pow((1 + rate), years * 12) - 1)) * loanAmount;
    }
}
