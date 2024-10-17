package com.hexaware.bankingsys.task8;

import java.util.Scanner;

public class Bank {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = null;

        while (true) {
            System.out.println("Welcome to the Bank!");
            System.out.println("1. Create Savings Account");
            System.out.println("2. Create Current Account");
            System.out.println("3. Exit");
            System.out.print("Please select an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Account Number: ");
                    String savingsAccountNumber = scanner.next();
                    
                    System.out.print("Enter Initial Balance: ");
                    double savingsInitialBalance = scanner.nextDouble();
                    
                    System.out.print("Enter Interest Rate: ");
                    double interestRate = scanner.nextDouble();
                    
                    account = new SavingsAccount(savingsAccountNumber, savingsInitialBalance, interestRate);
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    String currentAccountNumber = scanner.next();
                    
                    System.out.print("Enter Initial Balance: ");
                    double currentInitialBalance = scanner.nextDouble();
                    
                    account = new CurrentAccount(currentAccountNumber, currentInitialBalance);
                    break;

                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
                    continue;
            }

            if (account != null) {
                account.printAccountDetails();
               
            }
        }
    }
}
