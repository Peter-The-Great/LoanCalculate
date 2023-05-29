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
        if (bank.equalsIgnoreCase("ING") || bank.equalsIgnoreCase("ing") || bank.equalsIgnoreCase("ING Bank")) {
            return new ING();
        } else if (bank.equalsIgnoreCase("ABNAMRO") || bank.equalsIgnoreCase("abnamro") || bank.equalsIgnoreCase("ABN AMRO")) {
            return new ABNAMRO();
        } else if (bank.equalsIgnoreCase("Rabobank") || bank.equalsIgnoreCase("rabobank") || bank.equalsIgnoreCase("Rabo Bank")) {
            return new Rabobank();
        }
        return null;
    }
    public Loan getLoan(String loan) {
        return null;
    }
}