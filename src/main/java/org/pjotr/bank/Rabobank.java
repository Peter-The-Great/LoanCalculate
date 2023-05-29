package org.pjotr.bank;

public class Rabobank extends Bank{
    private final String bankName;
    public Rabobank() {
        bankName = "Rabobank";
    }
    public String getBankName() {
        return bankName;
    }
}
