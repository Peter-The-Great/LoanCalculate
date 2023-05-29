package org.pjotr.loans;

public class HomeLoan extends Loan {
    public HomeLoan() {
        setRate(10.5);
    }
    public double calculateLoanPayment(double loanamount, int years){
        int n = years * 12;
        double rate = getRate() / 1200;
        return (rate * Math.pow((1 + rate), n) / (Math.pow((1 + rate), n) - 1)) * loanamount;
    }
}
