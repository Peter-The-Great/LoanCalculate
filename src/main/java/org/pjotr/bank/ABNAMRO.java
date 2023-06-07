package org.pjotr.bank;

import org.pjotr.loans.Loan;

public class ABNAMRO extends Bank{
    public ABNAMRO() {
        setBankName("ABNAMRO");
        setAddress("ABNAMRO Address");
        setPhone("ABNAMRO Phone Number");
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
                loan.setRate(7.5);
                break;
            case "Education":
                loan.setRate(5.5);
                break;
            case "Business":
                loan.setRate(10.5);
                break;
            default:
                System.out.println("Loan Name not found");
        }
    }
}
