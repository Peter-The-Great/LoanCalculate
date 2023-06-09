package org.pjotr.loans;

import lombok.Getter;
import lombok.Setter;

import java.util.Currency;
import java.util.Locale;

public abstract class Loan {
    /**
     * This is the rate of interest for the loan that can be set by the bank.
     *
     */
    @Getter
    @Setter
    private double rate;

    /**
     * This is the name of the loan
     */
    @Getter
    @Setter
    private String name;
    /**
     * This is the currency symbol for the current locale
     *
     */
    private static final String currency = Currency.getInstance(Locale.getDefault()).getSymbol();

    /**
     * Template method for calculating the loan payment.
     * It calls the abstract method calculateInterest() implemented by subclasses.
     *
     * @param loanAmount the loan amount
     * @param years      the loan duration in years
     */
    public final void calculateLoanPayment(double loanAmount, int years) {
        double interest = calculateInterest(loanAmount);
        double emi = calculateEMI(loanAmount, interest, years);
        displayLoanPayment(emi, loanAmount);
    }

    /**
     * Abstract method to calculate the interest.
     * Subclasses must provide their own implementation.
     *
     * @param loanAmount the loan amount
     * @return the calculated interest
     */
     protected abstract double calculateInterest(double loanAmount);

    /**
     * Calculates the Equated Monthly Installment (EMI) based on the loan amount,
     * interest, and loan duration.
     *
     * @param loanAmount the loan amount
     * @param interest   the loan interest
     * @param years      the loan duration in years
     * @return the calculated EMI
     */
     protected abstract double calculateEMI(double loanAmount, double interest, int years);

    /**
     * Displays the loan payment details.
     *
     * @param emi        the EMI amount
     * @param loanAmount the loan amount
     */
    private void displayLoanPayment(double emi, double loanAmount) {
        System.out.println("Your monthly EMI is " + currency + Math.round(emi * 100.0)/100.0 +
                " for the amount " + currency + loanAmount + " you have borrowed!");
    }
}
