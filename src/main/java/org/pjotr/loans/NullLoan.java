package org.pjotr.loans;

public class NullLoan extends Loan{
    public NullLoan() {
        setName("Null");
        setRate(10.5);
    }
    @Override
    protected double calculateInterest(double loanAmount) {
        return getRate() / 1200;
    }

    @Override
    protected double calculateEMI(double loanAmount, double rate, int years) {
        return (rate * Math.pow((1 + rate), years) / (Math.pow((1 + rate), years) - 1)) * loanAmount;
    }
}
