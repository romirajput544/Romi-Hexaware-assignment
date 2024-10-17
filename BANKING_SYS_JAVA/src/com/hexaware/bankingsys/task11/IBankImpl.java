package com.hexaware.bankingsys.task11;



import java.util.ArrayList;
import java.util.List;

public class IBankImpl extends ICustomerImpl implements IBank {
    private String branchName;
    private String branchAddress;

    public IBankImpl(String branchName, String branchAddress) {
        this.branchName = branchName;
        this.branchAddress = branchAddress;
    }

    @Override
    public Account createAccount(Customer customer, String accType, float balance) {
        Account newAccount;
        switch (accType.toLowerCase()) {
            case "savings":
                newAccount = new SavingsAccount(balance, customer, 0.04f);
                break;
            case "current":
                newAccount = new CurrentAccount(balance, customer, 1000);
                break;
            case "zerobalance":
                newAccount = new ZeroBalanceAccount(customer);
                break;
            default:
                return null;
        }
        accounts.put(newAccount.getAccountNumber(), newAccount);
        return newAccount;
    }

    @Override
    public Account[] listAccounts() {
        return accounts.values().toArray(new Account[0]);
    }

    @Override
    public void calculateInterest() {
        for (Account account : accounts.values()) {
            if (account instanceof SavingsAccount) {
                SavingsAccount savingsAccount = (SavingsAccount) account;
                float interest = savingsAccount.getBalance() * savingsAccount.getInterestRate();
                savingsAccount.setBalance(savingsAccount.getBalance() + interest);
            }
        }
    }
}