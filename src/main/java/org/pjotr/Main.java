package org.pjotr;

import org.pjotr.factory.AbstractFactory;
import org.pjotr.factory.FactoryCreator;
import org.pjotr.loans.Loan;
import org.pjotr.bank.Bank;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String currency = Currency.getInstance(Locale.getDefault()).getSymbol();

        System.out.print("Enter the name of Bank from where you want to take loan amount: ");
        String bankName=br.readLine();

        System.out.print("\n");
        System.out.print("Enter the type of loan e.g. home loan or business loan or education loan : ");

        String loanName=br.readLine();
        AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
        assert bankFactory != null;
        Bank b= bankFactory.getBank(bankName);

        System.out.print("\n");
        System.out.print("Enter the loan amount you want to take: ");

        double loanAmount=Double.parseDouble(br.readLine());
        System.out.print("\n");
        System.out.print("Enter the number of years to pay your entire loan amount: ");
        int years = Integer.parseInt(br.readLine());

        System.out.print("\n");
        System.out.println("you are taking the loan from "+ b.getBankName());

        AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");
        assert loanFactory != null;
        Loan l=loanFactory.getLoan(loanName);

        System.out.println("your monthly EMI is "+ currency + Math.round(l.calculateLoanPayment(loanAmount,years) * 100.0)/100.0 + " for the amount " + currency + loanAmount + " you have borrowed");
    }
}