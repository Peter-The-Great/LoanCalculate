package org.pjotr.factory;

import org.pjotr.loans.Loan;
import org.pjotr.bank.Bank;

public abstract class AbstractFactory {
    /**
     * getBank() method is een functie die de bank ophaalt
     * @param bank
     * @return
     */
    public abstract Bank getBank(String bank);

    /**
     * getLoan() method is een functie die de loan ophaalt
     * @param loan
     * @return
     */
    public abstract Loan getLoan(String loan);
}
