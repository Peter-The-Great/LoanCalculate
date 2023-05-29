package org.pjotr.loans;

public class EducationLoan extends Loan{

    public EducationLoan() {
        setRate(9.5);
    }
    @Override
    public double calculateLoanPayment(double loanamount, int years){
        int n = years * 12;
        double rate = getRate() / 1200;
        return (rate * Math.pow((1 + rate), n) / (Math.pow((1 + rate), n) - 1)) * loanamount;
    }
}
