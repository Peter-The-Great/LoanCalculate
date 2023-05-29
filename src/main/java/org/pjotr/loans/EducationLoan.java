package org.pjotr.loans;

public class EducationLoan extends Loan{
    private double rate = 9.5;
    @Override
    public double calculateLoanPayment(double loanamount, int years){
        int n = years * 12;
        rate = rate / 1200;
        return (rate * Math.pow((1 + rate), n) / (Math.pow((1 + rate), n) - 1)) * loanamount;
    }
}
