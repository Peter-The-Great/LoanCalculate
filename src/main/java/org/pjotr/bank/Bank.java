package org.pjotr.bank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
public abstract class Bank {
    @Getter
    @Setter
    private String bankName;

    @Getter
    @Setter
    private String address;

    @Getter
    @Setter
    private String phone;

    public abstract void bankDetails();
}
