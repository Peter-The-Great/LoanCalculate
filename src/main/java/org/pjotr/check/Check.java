package org.pjotr.check;

public class Check {
    public static boolean isBankNameEmpty(String bankName) {
        return bankName.isEmpty() || isNumeric(bankName);
    }

    public static boolean isLoanNameEmpty(String loanName) {
        return loanName.isEmpty() || isNumeric(loanName);
    }

    public static boolean isLoanAmountInvalid(double loanAmount) {
        return loanAmount <= 0.0 || Double.isNaN(loanAmount);
    }

    public static boolean isYearsInvalid(int years) {
        return years <= 0;
    }
    private static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }
}
