package asm4;

public class CheckingAccount extends BankAccount{
    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }
    @Override
    public double withdraw(double amount) {
        if(getBalance()-amount>=-5000)
            return super.withdraw(amount);
        else {
            System.out.println("Số dư trong tài khoản không đủ để thực hiện");
            return getBalance();
        }
    }
}
