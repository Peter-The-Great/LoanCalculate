package org.pjotr.loans;

public class BussinessLoan extends Loan {

    public BussinessLoan() {
        setName("Business");
        setRate(11.0);
    }
    @Override
    public void calculateLoanPayment(double loanamount, int years){
        int n = years * 12;
        double rate = (getRate() / 100) / 12;
        getLoan((loanamount * rate) / (1 - Math.pow(1 + rate, -n)), loanamount);
    }
}
