package org.pjotr.factory;

import org.pjotr.loans.BussinessLoan;
import org.pjotr.loans.EducationLoan;
import org.pjotr.loans.HomeLoan;
import org.pjotr.loans.Loan;
import org.pjotr.bank.Bank;

public class LoanFactory extends AbstractFactory {
    public Bank getBank(String bank) {
        return null;
    }
    public Loan getLoan(String loan) {
        if (loan == null) {
            return null;
        }
        if (loan.equalsIgnoreCase("HomeLoan")) {
            return new HomeLoan();
        } else if (loan.equalsIgnoreCase("BussinessLoan")) {
            return new BussinessLoan();
        } else if (loan.equalsIgnoreCase("EducationLoan")) {
            return new EducationLoan();
        }
        return null;
    }
}
