package org.pjotr.bank;

public class ING extends Bank{
    public ING() {
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
}
