//package io;
//
//public class BankAccount {
//    public String accountName;
//    public int balance;
//
//    public BankAccount() {
//    }
//
//    public BankAccount(final String accountName, final int balance) {
//        this.accountName = accountName;
//        this.balance = balance;
//    }
//
//    public void deposit( final int amount) {
//        if ( (amount <= 0)) {
//            System.out.println("the process of deposit not done");
//            return;
//        }
//        balance += amount;
//        System.out.println("the process of deposit is done successfully" + amount);
//    }
//
//    public void withDraw(final int amount) {
//        if ( (amount <= 0)) {
//            System.out.println("the process of withDraw not done");
//            return;
//        }
//        balance -= amount;
//        System.out.println("the process of withDraw is done successfully" + amount);
//    }
//
//    public void checkBalance() {
//        System.out.println("current balance is = "+balance);
//    }
//}
