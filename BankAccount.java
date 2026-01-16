/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banking;

/**
 *
 * @author Rachel Gifty Jippy
 */

public class BankAccount {

    // Instance variables
    private String accountHolder;
    private double balance;
    private String accountNumber;

    // Protected variable (Access Specifiers Challenge)
    protected String accountStatus;

    // Constants
    private static final double WITHDRAWAL_LIMIT = 1000.0;
    private static final double OVERDRAFT_FEE = 10.0;

    // Constructor
    public BankAccount(String accountHolder, String accountNumber, double initialDeposit) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = initialDeposit;
        this.accountStatus = "Active";
    }

    // Getter methods
    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (accountStatus.equals("Frozen")) {
            System.out.println("Account is frozen. Deposit not allowed.");
            return;
        }

        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method (with limit & overdraft fee)
    public void withdraw(double amount) {
        if (accountStatus.equals("Frozen")) {
            System.out.println("Account is frozen. Withdrawal not allowed.");
            return;
        }

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
            return;
        }

        if (amount > WITHDRAWAL_LIMIT) {
            System.out.println("Withdrawal denied. Maximum limit is $" + WITHDRAWAL_LIMIT);
            return;
        }

        balance -= amount;
        System.out.println("Withdrew: $" + amount);

        // Overdraft fee
        if (balance < 0) {
            balance -= OVERDRAFT_FEE;
            System.out.println("Overdraft fee charged: $" + OVERDRAFT_FEE);
        }
    }

    // Freeze account method
    public void freezeAccount() {
        accountStatus = "Frozen";
        System.out.println("Account has been frozen.");
    }

    // Print account details
    public void printAccountDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Status: " + accountStatus);
        System.out.println("Current Balance: $" + balance);
    }
}

