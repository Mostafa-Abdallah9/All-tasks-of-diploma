package com.pioneers.$07oop.$01class.tasks.bank;

public class BankApp {
    // Write a Java program to demonstrate how a banking system works, where we deposit and withdraw money from our
    // account, and show the account balance.
    public static void main(String[] args) {
        Account account1 = new Account("Mostafa Eldesouky", "123456789");

        try {
            account1.deposit(5000);
            account1.withdraw(500);
        } catch (AccountOperationException e) {
            System.out.println("Sending a notification to the " + account1.getUserName() + " about the failed operation: " + e.getMessage());
        }

        account1.showBalance();
    }
}
