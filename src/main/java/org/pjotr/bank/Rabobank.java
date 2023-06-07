package org.pjotr.bank;

import org.pjotr.loans.Loan;

public class Rabobank extends Bank{
    public Rabobank() {
        setBankName("Rabobank");
        setAddress("Rabobank Address");
        setPhone("Rabobank Phone Number");
    }
    @Override
    public void bankDetails() {
        System.out.println("Bank Name: " + getBankName());
        System.out.println("Bank Address: " + getAddress());
        System.out.println("Bank Phone: " + getPhone());
    }
    public void changeLoanRate(Loan loan) {
        //Get Loan name
        switch (loan.getName()) {
            case "Home":
                loan.setRate(3.5);
                break;
            case "Education":
                loan.setRate(1.5);
                break;
            case "Business":
                loan.setRate(4.5);
                break;
            default:
                System.out.println("Loan Name not found");
        }
    }
}
