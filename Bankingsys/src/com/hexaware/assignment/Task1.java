package com.hexaware.assignment;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // Input: user's current balance
        System.out.print("Enter your current balance: ");
        double balance = sc.nextDouble();

        // Display options
        System.out.println("\nATM Menu:");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");

        System.out.println("Choose an option (1, 2, or 3): ");
        int choice = sc.nextInt();

        if (choice == 1) {
            
            System.out.println("Your current balance is: " + balance);
        } 
        else if (choice == 2) {
            
            System.out.print("Enter the amount to withdraw: ");
            double withdrawAmount = sc.nextDouble();

            if (withdrawAmount <= balance && (withdrawAmount % 100 == 0 || withdrawAmount % 500 == 0)) {
                balance -= withdrawAmount;
                System.out.println("Withdrawal successful! Your new balance is: " + balance);
            } 
            else {
                System.out.println("Error: Invalid amount or insufficient balance.");
            }
        } 
        else if (choice == 3) {
           
            System.out.print("Enter the amount to deposit: ");
            balance += sc.nextDouble();
            System.out.println("Deposit successful! Your new balance is: " + balance);
        } 
        else {
            System.out.println("Invalid choice.");
        }

	}

}
