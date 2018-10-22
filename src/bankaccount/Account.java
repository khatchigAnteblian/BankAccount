/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount;

/**
 *
 * @author 345983704
 */
public class Account {
    public long acctNum;
    private double balance;
    private String type;
    private double interestRate;
    
    public Account(long acctNum, double balance, String type, double interest) {
        this.acctNum = acctNum;
        this.balance = balance;
        this.type = type;
        this.interestRate = interest;
    }
    
    public void deposit(double amount) {
        this.balance += amount;
    }
    
    public boolean withdraw(double amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
            return true;
        }
        return false;
    }
    
    public void applyInterest() {
        this.balance += this.balance * this.interestRate;
    }

    public double getBalance() {
        return balance;
    }
    
    public String getType() {
        return type;
    }
}
