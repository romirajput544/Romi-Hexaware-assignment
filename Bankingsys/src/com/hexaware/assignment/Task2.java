package com.hexaware.assignment;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Input: customer's credit score and annual income
        System.out.print("Enter your credit score: ");
        int creditScore = sc.nextInt();

        System.out.print("Enter your annual income: ");
        double annualIncome = sc.nextDouble();

        // Eligibility criteria
        int requiredCreditScore = 700;
        double requiredIncome = 50000;

        // Check if customer is eligible for a loan
        if (creditScore > requiredCreditScore && annualIncome >= requiredIncome) {
            System.out.println("Congratulations! You are eligible for a loan.");
        } 
        else 
        {
            System.out.println("Sorry, you are not eligible for a loan.");
        }


	}

}
