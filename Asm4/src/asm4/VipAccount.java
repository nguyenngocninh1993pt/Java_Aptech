package asm4;

public class VipAccount extends BankAccount{
    public VipAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public double withdraw(double amount) {
        return super.withdraw(amount);
    }

    @Override
    public double deposit(double amount) {
        return super.deposit(amount+0.01*amount);
    }
}
