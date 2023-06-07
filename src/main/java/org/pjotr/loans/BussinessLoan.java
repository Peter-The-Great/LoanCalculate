package org.pjotr.loans;

public class BussinessLoan extends Loan {

    public BussinessLoan() {
        setName("Business");
        setRate(11.0);
    }
    @Override
    public void calculateLoanPayment(double loanamount, int years){
        int n = years * 12;
        double rate = getRate() / 1200;
        getLoan((rate * Math.pow((1 + rate), n) / (Math.pow((1 + rate), n) - 1)) * loanamount, loanamount);
    }
}
