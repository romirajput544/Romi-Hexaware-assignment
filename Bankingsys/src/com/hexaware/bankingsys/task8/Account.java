package com.hexaware.bankingsys.task8;

public class Account {
    private String accountNumber;
    private String accountType;
    private double accountBalance;

    public Account() {
    }

    public Account(String accountNumber, String accountType, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

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

    public void deposit(float amount) {
        if (amount > 0) {
            accountBalance += amount;
            System.out.println("Deposit of " + amount + " was successful. Current balance: " + accountBalance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(float amount) {
        System.out.println("Withdraw method not implemented for base Account class.");
    }

    public void calculateInterest() {
        System.out.println("Interest calculation not implemented for base Account class.");
    }

    public void printAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Account Balance: " + accountBalance);
    }
}
