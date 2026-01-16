/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author Rachel Gifty Jippy
 */
public class Banking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // Create an instance of the BankAccount class

        BankAccount account1 = new BankAccount("Elisha Benson", "12345", 500.0);

        account1.printAccountDetails();
        // Test deposit

        account1.deposit(200.0);

        account1.printAccountDetails();


        // Test withdrawal

        account1.withdraw(100.0);

        account1.printAccountDetails();


        // Test invalid withdrawal

        account1.withdraw(700.0); // Insufficient funds


        // Loop to demonstrate multiple deposits and withdrawals

        for (int i = 1; i <= 3; i++) {

            account1.deposit(50 * i); // Deposit increasing amounts

            account1.withdraw(20 * i); // Withdraw increasing amounts

            account1.printAccountDetails();

        }


        // Show final balance after loop

        System.out.println("Final Balance: $" + account1.getBalance());
    }
    
}

