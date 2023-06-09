package org.pjotr.loans;

public class BussinessLoan extends Loan {

    public BussinessLoan() {
        setName("Business");
        setRate(11.0);
    }
    @Override
    protected double calculateInterest(double loanAmount) {
        return (getRate() /100) / 12;
    }

    @Override
    protected double calculateEMI(double loanAmount, double rate, int years) {
        return (loanAmount * rate) / (1 - Math.pow(1 + rate, -(years*12)));
    }
}
