package org.pjotr.bank;

import org.pjotr.loans.Loan;

public class ABNAMRO extends Bank{
    public ABNAMRO() {
        setBankName("ABNAMRO");
        setAddress("ABNAMRO Address");
        setPhone("ABNAMRO Phone Number");
    }
    public void changeLoanRate(Loan loan) {
        //Get Loan name
        switch (loan.getName()) {
            case "Home" -> loan.setRate(7.5);
            case "Education" -> loan.setRate(5.5);
            case "Business" -> loan.setRate(10.5);
            default -> System.out.println("Loan Name not found");
        }
    }
}
