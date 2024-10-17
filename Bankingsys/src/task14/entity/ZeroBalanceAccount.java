package task14.entity;

public class ZeroBalanceAccount extends Account {
    public ZeroBalanceAccount(long accountNumber, Customer customer) {
        super(accountNumber, "Zero Balance", 0.0, customer);
    }
}
