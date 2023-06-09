package org.pjotr.factory;

import org.pjotr.bank.*;
import org.pjotr.loans.Loan;
import org.pjotr.loans.NullLoan;

public class BankFactory extends AbstractFactory {
    public Bank getBank(String bank) {
        if (bank.equalsIgnoreCase("ING") || bank.equalsIgnoreCase("ING Bank")) {
            return new ING();
        } else if (bank.equalsIgnoreCase("ABNAMRO") || bank.equalsIgnoreCase("ABN AMRO")) {
            return new ABNAMRO();
        } else if (bank.equalsIgnoreCase("RABOBANK") || bank.equalsIgnoreCase("Rabo Bank")) {
            return new Rabobank();
        }
        return new Nullbank();
    }

    @Override
    public Loan getLoan(String loan) {
        return new NullLoan();
    }

}