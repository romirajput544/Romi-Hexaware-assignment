package com.hexaware.assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
	        ArrayList<String> transactions = new ArrayList<>();
	        double balance = 0.0;

	        System.out.println("Welcome to the Bank Transaction System!");

	        while (true) {
	          
	            System.out.println("Choose an option: ");
	            System.out.println("1. Deposit");
	            System.out.println("2. Withdraw");
	            System.out.println("3. Exit and show transaction history");
	            int choice = scanner.nextInt();

	         
	            if (choice == 1) {
	                System.out.print("Enter the deposit amount: ");
	                double deposit = scanner.nextDouble();
	                balance += deposit;
	                transactions.add("Deposit: $" + deposit);
	                System.out.println("Deposit successful! Current Balance: $" + balance);

	            } 
	            else if (choice == 2) {
	                System.out.print("Enter the withdrawal amount: ");
	                double withdrawal = scanner.nextDouble();

	                if (withdrawal > balance) {
	                    System.out.println("Insufficient balance for withdrawal.");
	                } 
	                else {
	                    balance -= withdrawal;
	                    transactions.add("Withdrawal: $" + withdrawal);
	                    System.out.println("Withdrawal successful! Current Balance: $" + balance);
	                }

	            } 
	            else if (choice == 3) {
	               
	                System.out.println("Exiting and displaying transaction history...");
	                break;
	            } 
	            else {
	                System.out.println("Invalid option, please try again.");
	            }
	        }

	      
	        System.out.println("\nTransaction History:");
	        for (String transaction : transactions) {
	            System.out.println(transaction);
	        }

	        System.out.println("Final Balance: $" + balance);
	        scanner.close();
	}

}
