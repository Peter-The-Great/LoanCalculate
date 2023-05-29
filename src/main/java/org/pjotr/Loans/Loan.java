package org.pjotr.Loans;

public abstract class Loan {
    private double rate;
    public abstract void calculateLoanPayment(double loanamount, int years);

    public void getInterestRate(double rate) {
        this.rate = rate;
    }
}
