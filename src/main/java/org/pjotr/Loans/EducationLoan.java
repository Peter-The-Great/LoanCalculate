package org.pjotr.Loans;

public class EducationLoan extends Loan{
    private double rate = 6.5;
    public void calculateLoanPayment(double loanamount, int years){
        int n;
        n = years * 12;
        rate = rate / 1200;
        double EMI = ((rate * Math.pow((1 + rate), n)) / ((Math.pow((1 + rate), n)) - 1)) * loanamount;
        System.out.println("your monthly EMI is " + EMI + " for the amount" + loanamount + " you have borrowed");
    }
}
