package org.pjotr.bank;

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
}
