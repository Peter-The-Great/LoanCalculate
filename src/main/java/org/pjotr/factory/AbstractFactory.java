package org.pjotr.factory;

import org.pjotr.loans.Loan;
import org.pjotr.bank.Bank;

public abstract class AbstractFactory {
    public abstract Bank getBank(String bank);
    public abstract Loan getLoan(String loan);
}
