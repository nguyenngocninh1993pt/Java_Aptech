package asm4;

public class Main {
    public static void main(String[] agrs){
        // BankAccount:
        BankAccount ba = new BankAccount("123456789", 10000);
        ba.withdraw(1000);
        ba.deposit(2000);
        ba.PrintBalance();

        // SavingAccount:
        SavingAccount sa = new SavingAccount("123456789", 1000);
        sa.withdraw(100);
        sa.deposit(200);
        sa.PrintBalance();

        // CheckingAccount:
        CheckingAccount ca = new CheckingAccount("123456789", 2000);
        ca.withdraw(5000);
        ca.PrintBalance();

        // VipAccount:
        VipAccount va = new VipAccount("123456789", 1000);
        va.deposit(100);
        va.PrintBalance();
    }
}
