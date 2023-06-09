package org.pjotr.factory;

import org.pjotr.bank.Nullbank;
import org.pjotr.loans.*;
import org.pjotr.bank.Bank;

public class LoanFactory extends AbstractFactory {
    public Bank getBank(String bank) {
        return new Nullbank();
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
            return new NullLoan();
        }
    }
}
