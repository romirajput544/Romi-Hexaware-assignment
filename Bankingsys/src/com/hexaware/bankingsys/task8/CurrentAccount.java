package com.hexaware.bankingsys.task8;

public class CurrentAccount extends Account {
    private static final double OVERDRAFT_LIMIT = 200.0;

    public CurrentAccount(String accountNumber, double accountBalance) {
        super(accountNumber, "Current", accountBalance);
    }

    @Override
    public void withdraw(float amount) {
        if (amount > 0) {
            if (amount <= getAccountBalance() + OVERDRAFT_LIMIT) 
            {
                setAccountBalance(getAccountBalance() - amount);
                System.out.println("Withdrawal of " + amount + " was successful");
            }
            else {
                System.out.println("Withdrawal exceeds overdraft limit.");
            }
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}
