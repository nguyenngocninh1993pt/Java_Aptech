package asm4;

public class SavingAccount extends BankAccount{
    public SavingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }
    @Override
    public double withdraw(double amount){
        return super.withdraw(amount+0.02*amount);
    }
}
