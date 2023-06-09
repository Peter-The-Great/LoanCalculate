package org.pjotr.bank;

import org.pjotr.loans.Loan;

public class Nullbank extends Bank{
    public Nullbank() {
        setBankName("Nullbank");
        setAddress("Nullbank Address");
        setPhone("Nullbank Phone Number");
    }
    public void changeLoanRate(Loan loan) {
        switch (loan.getName()) {
            case "Home" -> loan.setRate(8.5);
            case "Education" -> loan.setRate(9.5);
            case "Business" -> loan.setRate(10.5);
            default -> System.out.println("Loan Name not found");
        }
    }
}
