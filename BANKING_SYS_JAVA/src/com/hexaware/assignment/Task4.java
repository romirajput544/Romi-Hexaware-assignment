package com.hexaware.assignment;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task4 {
    private static Map<String, Double> accounts = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
       
        accounts.put("101", 6700.0);
        accounts.put("102", 7500.0);
        accounts.put("103", 5200.0);

        while (true) {
            System.out.println("\nBank Account Balance Checker");
            System.out.println("1. Check Balance");
            System.out.println("2. Exit");
            System.out.print("Enter your choice (1-2): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            if (choice == 1) {
                checkBalance();
            } 
            else if (choice == 2) {
            	
                System.out.println("Thank you for using the Bank Account Balance Checker. Goodbye!");
                break;
            } 
            
            else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    private static void checkBalance() {
        while (true) {
            System.out.print("Enter your account number: ");
            String accountNumber = scanner.nextLine();

            if (accounts.containsKey(accountNumber)) {
                double balance = accounts.get(accountNumber);
                System.out.printf("Your account balance is: $%.2f\n", balance);
                break;
            } 
            else {
                System.out.println("Invalid account number. Would you like to try again? (yes/no)");
                String retry = scanner.nextLine().toLowerCase();
                
                if (!retry.equals("yes")) {
                    break;
                }
            }
        }
    }
}