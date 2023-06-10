package org.pjotr.loans;


public class EducationLoan extends Loan{

    public EducationLoan() {
        setName("Education");
        setRate(9.5);
    }
    @Override
    protected double calculateInterest(double loanAmount) {
        return (getRate() / 100) / 12;
    }

    @Override
    protected double calculateEMI(double loanAmount, double rate, int years) {
        return loanAmount * (rate * Math.pow(1 + rate, years * 12)) / (Math.pow(1 + rate, years * 12) + 1);
    }
}
