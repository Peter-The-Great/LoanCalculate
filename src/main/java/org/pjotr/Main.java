package org.pjotr;

import org.pjotr.factory.AbstractFactory;
import org.pjotr.factory.FactoryCreator;
import org.pjotr.loans.Loan;
import org.pjotr.bank.Bank;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the name of Bank from where you want to take loan amount: ");
        String bankName=br.readLine();

        System.out.print("\n");
        System.out.print("Enter the type of loan e.g. home loan or business loan or education loan : ");

        String loanName=br.readLine();
        AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
        assert bankFactory != null;
        Bank b = bankFactory.getBank(bankName);

        System.out.print("\n");
        System.out.print("Enter the loan amount you want to take: ");

        double loanAmount=Double.parseDouble(br.readLine());
        System.out.print("\n");
        System.out.print("Enter the number of years to pay your entire loan amount: ");
        int years = Integer.parseInt(br.readLine());

        System.out.print("\n");
        System.out.println("You are taking the loan from "+ b.getBankName());
        b.bankDetails();

        AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");
        assert loanFactory != null;
        Loan l = loanFactory.getLoan(loanName);
        l.calculateLoanPayment(loanAmount,years);
    }
}