package com.hexaware.bankingsys.task8;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, double accountBalance, double interestRate) {
        super(accountNumber, "Savings", accountBalance);
        this.interestRate = interestRate;
    }

    public void calculateInterest() {
        double interest = (getAccountBalance() * interestRate) / 100;
        setAccountBalance(getAccountBalance() + interest);
        System.out.println("Interest of " + interest + " has been added to the account");
    }

    @Override
    public void withdraw(float amount) {
        if (amount > 0) {
            if (amount <= getAccountBalance()) {
                setAccountBalance(getAccountBalance() - amount);
                System.out.println("Withdrawal of " + amount + " was successful");
            } else {
                System.out.println("Insufficient balance for withdrawal.");
            }
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}
