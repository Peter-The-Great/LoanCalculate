package org.pjotr.bank;

import org.pjotr.loans.Loan;

public class Nullbank extends Bank{
    public Nullbank() {
        setBankName("ING");
        setAddress("ING Address");
        setPhone("ING Phone Number");
    }
    @Override
    public void bankDetails() {
        System.out.println("Bank Name: " + getBankName());
        System.out.println("Bank Address: " + getAddress());
        System.out.println("Bank Phone: " + getPhone());
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
