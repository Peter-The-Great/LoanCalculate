package org.pjotr;

import org.pjotr.check.Check;
import org.pjotr.factory.AbstractFactory;
import org.pjotr.loans.Loan;
import org.pjotr.bank.Bank;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String bankName = "";
        while (Check.isBankNameEmpty(bankName)) {
            System.out.println("Enter the name of the Bank from where you want to take a loan: ");
            bankName = br.readLine().trim();
            if (Check.isBankNameEmpty(bankName)) {
                System.out.println("Bank name cannot be empty or an number. Please try again.");
            }
        }

        String loanName = "";
        while (Check.isLoanNameEmpty(loanName)) {
            System.out.println("Enter the type of loan (e.g., home loan, business loan, education loan): ");
            loanName = br.readLine().trim();
            if (Check.isLoanNameEmpty(loanName)) {
                System.out.println("Loan type cannot be empty or an number. Please try again.");
            }
        }

        // Abstract Factory pattern
        AbstractFactory bankFactory = AbstractFactory.getFactory("Bank");
        assert bankFactory != null;
        // Factory pattern
        Bank bank = bankFactory.getBank(bankName);

        double loanAmount = 0.0;
        while (Check.isLoanAmountInvalid(loanAmount)) {
            System.out.println("Enter the loan amount you want to take: ");
            try {
                loanAmount = Double.parseDouble(br.readLine());
                if (Check.isLoanAmountInvalid(loanAmount)) {
                    System.out.println("Loan amount must be greater than zero. Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid loan amount format. Please enter a valid numeric value.");
            }
        }

        int years = 0;
        while (Check.isYearsInvalid(years)) {
            System.out.println("Enter the number of years to repay the loan: ");
            try {
                years = Integer.parseInt(br.readLine());
                if (Check.isYearsInvalid(years)) {
                    System.out.println("Number of years must be greater than zero. Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid number of years format. Please enter a valid numeric value.");
            }
        }

        System.out.println("You are taking the loan from " + bank.getBankName());
        bank.bankDetails();

        // Abstract Factory pattern
        AbstractFactory loanFactory = AbstractFactory.getFactory("Loan");
        assert loanFactory != null;

        // Factory pattern
        Loan loan = loanFactory.getLoan(loanName);
        // Dependency Injection

        bank.changeLoanRate(loan);
        // Template Method pattern
        loan.calculateLoanPayment(loanAmount, years);
    }
}