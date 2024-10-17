package com.hexaware.bankingsys.task7;

public class Account {
	
	  private String accountNumber;
	  private String accountType;
	  private double accountBalance;

	  private static final double INTEREST_RATE = 4.5;   
	 
	  public String getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}


	public String getAccountType() {
		return accountType;
	}


	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}


	public double getAccountBalance() {
		return accountBalance;
	}


	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}


	public static double getInterestRate() {
		return INTEREST_RATE;
	}


	public Account(String accountNumber, String accountType, double accountBalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
	}

	 public void deposit(double amount) {
	        if (amount > 0) {
	            accountBalance += amount;
	            System.out.println("Deposit of " + amount + " was successful. Current balance: " + accountBalance);
	        } else {
	            System.out.println("Invalid deposit amount.");
	        }
	    }
	 
	 
	 public void withdraw(double amount) {
	        if (amount > 0) {
	            if (amount <= accountBalance) {
	                accountBalance -= amount;
	                System.out.println("Withdrawal of " + amount + " was successful. Current balance: " + accountBalance);
	            } else {
	                System.out.println("Insufficient balance. Withdrawal failed.");
	            }
	        } else {
	            System.out.println("Invalid withdrawal amount.");
	        }
	    }

	 
	 
	 public void calculateInterest() {
	        double interest = (accountBalance * INTEREST_RATE) / 100;
	        System.out.println("Interest calculated on current balance: $" + interest);
	    }
	 
	 
	 public void printAccountDetails() {
	        System.out.println("Account Number: " + accountNumber);
	        System.out.println("Account Type: " + accountType);
	        System.out.println("Account Balance: " + accountBalance);
	    }
	 
	public static void main(String args[]) {
		
		   Account account = new Account("321", "Current", 2500.00);
		   
		   System.out.println("\nAccount 2 Details:");
	        account.printAccountDetails();

	        account.calculateInterest();
	        account.deposit(1000);
	        
		
	}
	

}
