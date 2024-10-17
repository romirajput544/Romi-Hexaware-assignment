package com.hexaware.assignment;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the number of customers: ");
        int numberOfCustomers = sc.nextInt();

       
        for (int i = 1; i <= numberOfCustomers; i++) {
            System.out.println("\nCustomer " + i + ":");

        
            System.out.print("Enter the initial balance: ");
            double initialBalance = sc.nextDouble();

            System.out.print("Enter the annual interest rate (in %): ");
            double annualInterestRate = sc.nextDouble();

            System.out.print("Enter the number of years: ");
            int years = sc.nextInt();

          
            double futureBalance = initialBalance * Math.pow(1 + (annualInterestRate / 100), years);

            
            System.out.printf("The future balance after %d years will be: %.2f%n", years, futureBalance);
        }
	}

}
