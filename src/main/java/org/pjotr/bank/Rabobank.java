package org.pjotr.bank;

import org.pjotr.loans.Loan;

public class Rabobank extends Bank{
    public Rabobank() {
        setBankName("Rabobank");
        setAddress("Rabobank Address");
        setPhone("Rabobank Phone Number");
    }
    public void changeLoanRate(Loan loan) {
        //Get Loan name
        switch (loan.getName()) {
            case "Home" -> loan.setRate(3.5);
            case "Education" -> loan.setRate(1.5);
            case "Business" -> loan.setRate(4.5);
            default -> System.out.println("Loan Name not found");
        }
    }
}
