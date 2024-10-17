package com.hexaware.bankingsys.task7;

public class Bank {

	public static void main(String[] args) {
		
		Account account = new Account("321", "Savings", 1000.00);
		
		
		   account.deposit(2500);
		   
		   account.withdraw(1000);
		   
		   account.withdraw(2000);
		   
		   if (account.getAccountType().equalsIgnoreCase("Savings"))
		   {
	            System.out.println("\nCalculating Interest for Savings Account:");
	            account.calculateInterest(); 
	        }
		   
		   


	}

}
