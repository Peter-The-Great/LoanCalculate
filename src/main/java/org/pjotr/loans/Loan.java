package org.pjotr.loans;

import lombok.Getter;
import lombok.Setter;

public abstract class Loan {
    public abstract double calculateLoanPayment(double loanamount, int years);
    @Getter
    @Setter
    private double rate;
}
