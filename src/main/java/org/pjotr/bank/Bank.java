package org.pjotr.bank;
import lombok.Getter;
import lombok.Setter;
import org.pjotr.loans.Loan;

public abstract class Bank {
    @Getter
    @Setter
    private String bankName;

    @Getter
    @Setter
    private String address;

    @Getter
    @Setter
    private String phone;

    /**
     * bankDetails() method is een functie die de bank details ophaalt
     */
    public abstract void bankDetails();

    /**
     * changeLoanRate() method is een functie die de rente van een loan veranderd
     * @param loan
     */
    public abstract void changeLoanRate(Loan loan);
}