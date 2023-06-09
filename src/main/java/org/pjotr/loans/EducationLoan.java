package org.pjotr.loans;

public class EducationLoan extends Loan{

    public EducationLoan() {
        setName("Education");
        setRate(9.5);
    }
    @Override
    public void calculateLoanPayment(double loanamount, int years){
        int n = years * 12;
        double rate = getRate() / 1200;
        getLoan((loanamount * rate) / (1 - Math.pow(1 + rate, -n)) * loanamount, loanamount);
    }
}
