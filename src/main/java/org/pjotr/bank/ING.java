package org.pjotr.bank;

public class ING extends Bank{
    private final String bankName;
    public ING() {
        bankName = "ING";
    }
    public String getBankName() {
        return bankName;
    }
}
