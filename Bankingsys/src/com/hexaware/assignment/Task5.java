package com.hexaware.assignment;

import java.util.Scanner;

public class Task5 {

	
    public static boolean isValidPassword(String password) {
        
        if (password.length() < 8) {
            System.out.println("Error: Password must be at least 8 characters long.");
            return false;
        }

       
        boolean hasUppercase = false;
        boolean hasDigit = false;
        
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
            }
            if (Character.isDigit(c)) {
                hasDigit = true;
            }
        }

        if (!hasUppercase) {
            System.out.println("Error: Password must contain at least one uppercase letter.");
            return false;
        }

       
        if (!hasDigit) {
            System.out.println("Error: Password must contain at least one digit.");
            return false;
        }

      
        return true;
    }

	
	public static void main(String[] args) {
		

		 Scanner scanner = new Scanner(System.in);

	        
	        System.out.println("Please create a password for your bank account:");
	        String password = scanner.nextLine();

	        
	        if (isValidPassword(password)) {
	            System.out.println("Password created successfully!");
	        } else {
	            System.out.println("Password creation failed. Please try again.");
	        }

	        
	        scanner.close();
		
		
	}

}
