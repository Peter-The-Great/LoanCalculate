package org.pjotr;

import org.pjotr.factory.AbstractFactory;
import org.pjotr.loans.Loan;
import org.pjotr.bank.Bank;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String bankName = "";
        while (bankName.isEmpty()) {
            System.out.println("Enter the name of the Bank from where you want to take a loan: ");
            bankName = br.readLine().trim();
            if (bankName.isEmpty()) {
                System.out.println("Bank name cannot be empty. Please try again.");
            }
        }

        String loanName = "";
        while (loanName.isEmpty()) {
            System.out.println("Enter the type of loan (e.g., home loan, business loan, education loan): ");
            loanName = br.readLine().trim();
            if (loanName.isEmpty()) {
                System.out.println("Loan type cannot be empty. Please try again.");
            }
        }

        AbstractFactory bankFactory = AbstractFactory.getFactory("Bank");
        assert bankFactory != null;
        Bank bank = bankFactory.getBank(bankName);

        double loanAmount = 0.0;
        while (loanAmount <= 0.0) {
            System.out.println("Enter the loan amount you want to take: ");
            try {
                loanAmount = Double.parseDouble(br.readLine());
                if (loanAmount <= 0.0) {
                    System.out.println("Loan amount must be greater than zero. Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid loan amount format. Please enter a valid numeric value.");
            }
        }

        int years = 0;
        while (years <= 0) {
            System.out.println("Enter the number of years to repay the loan: ");
            try {
                years = Integer.parseInt(br.readLine());
                if (years <= 0) {
                    System.out.println("Number of years must be greater than zero. Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid number of years format. Please enter a valid numeric value.");
            }
        }

        System.out.println("You are taking the loan from " + bank.getBankName());
        bank.bankDetails();

        AbstractFactory loanFactory = AbstractFactory.getFactory("Loan");
        assert loanFactory != null;
        Loan loan = loanFactory.getLoan(loanName);
        loan.calculateLoanPayment(loanAmount, years);
    }
}