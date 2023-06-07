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
        if (loan.equalsIgnoreCase("HomeLoan") || loan.equalsIgnoreCase("Home")) {
            return new HomeLoan();
        } else if (loan.equalsIgnoreCase("BussinessLoan") || loan.equalsIgnoreCase("Bussiness")) {
            return new BussinessLoan();
        } else if (loan.equalsIgnoreCase("EducationLoan") || loan.equalsIgnoreCase("Education")) {
            return new EducationLoan();
        }
        else {
            return null;
        }
    }
}
