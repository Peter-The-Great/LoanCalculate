package org.pjotr.bank;

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
}
