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
public class BankAccount {
    public static void main(String[] args) {
        Account acct1 = new Account(12323453456L, 253.05, "savings", 1.05);
        Account acct2 = new Account(75293485763L, 1000000.00, "chequing", 1.05);
        
        acct1.deposit(100);
        if (acct2.withdraw(50000)) {
            System.out.println("Withdrawal successful!");
        }
        acct2.applyInterest();
        System.out.println("Account one is a " + acct1.getType() + " account with a balance of: $" + acct1.getBalance());
        System.out.println("Account two is a " + acct2.getType() + " account with a balance of: $" + acct2.getBalance());
    }
}
