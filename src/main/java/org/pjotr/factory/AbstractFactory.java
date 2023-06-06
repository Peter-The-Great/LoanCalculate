package org.pjotr.factory;

import org.pjotr.loans.Loan;
import org.pjotr.bank.Bank;

public abstract class AbstractFactory {
    /**
     * getBank() method is een functie die de bank ophaalt
     * @param bank De bank die opgehaald moet worden.
     */
    public abstract Bank getBank(String bank);

    /**
     * getLoan() method is een functie die de loan ophaalt
     * @param loan De loan die opgehaald moet worden.
     */
    public abstract Loan getLoan(String loan);

    public static AbstractFactory getFactory(String choice){
        if (choice.equalsIgnoreCase("Bank")) {
            return new BankFactory();
        } else if (choice.equalsIgnoreCase("Loan")) {
            return new LoanFactory();
        }
        return null;
    }
}
