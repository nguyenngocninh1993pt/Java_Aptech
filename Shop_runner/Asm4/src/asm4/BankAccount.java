package asm4;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount() {
    }
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public double setBalance(double balance) {
        return this.balance = balance;
    }
    public double deposit(double amount){
        return setBalance(getBalance()+amount);
    }
    public double withdraw(double amount){
        setBalance(getBalance()-amount);
        return getBalance();
    }
    public void PrintBalance(){
        System.out.println("Số dư hiện tại là: "+getBalance());
    }
}
