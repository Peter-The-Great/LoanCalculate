package org.pjotr.factory;

import org.pjotr.loans.Loan;
import org.pjotr.bank.ABNAMRO;
import org.pjotr.bank.Bank;
import org.pjotr.bank.ING;
import org.pjotr.bank.Rabobank;

public class BankFactory extends AbstractFactory {
    public Bank getBank(String bank) {
        if (bank == null) {
            return null;
        }
        if (bank.equalsIgnoreCase("ING")) {
            return new ING();
        } else if (bank.equalsIgnoreCase("ABNAMRO")) {
            return new ABNAMRO();
        } else if (bank.equalsIgnoreCase("Rabobank")) {
            return new Rabobank();
        }
        return null;
    }
    public Loan getLoan(String loan) {
        return null;
    }
}