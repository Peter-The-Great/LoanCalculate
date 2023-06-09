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
        int n = years * 12;
        double numerator = rate * Math.pow((1 + rate), n);
        double denominator = Math.pow((1 + rate), n) - 1;
        return numerator / denominator * loanAmount;
    }
}
