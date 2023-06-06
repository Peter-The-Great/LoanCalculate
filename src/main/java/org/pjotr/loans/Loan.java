package org.pjotr.loans;

import lombok.Getter;
import lombok.Setter;

import java.util.Currency;
import java.util.Locale;

public abstract class Loan {
    /**
     * This is the rate of interest for the loan that can be set by the bank.
     * @param rate of interest
     */
    @Getter
    @Setter
    private double rate;
    /**
     * This is the currency symbol for the current locale
     * @param currency
     */
    private static final String currency = Currency.getInstance(Locale.getDefault()).getSymbol();
    /**
     * calculateLoanPayment() method is een functie die de
     * @param loanamount
     * @param years
     */
    public abstract void calculateLoanPayment(double loanamount, int years);

    /**
     * getLoan() method is een functie die de loan ophaalt
     * @param sum
     * @param loanAmount
     */
    public static void getLoan(double sum, double loanAmount) {
        System.out.println("Your monthly EMI is "+ currency + Math.round(sum * 100.0)/100.0 + " for the amount " + currency + loanAmount + " you have borrowed!");
    }
}
