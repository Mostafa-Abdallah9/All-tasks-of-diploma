package io;

public class BankAcount {
        public String accountName;
    public int balance;

    public BankAcount() {
    }

    public BankAcount(final String accountName, final int balance) {
        this.accountName = accountName;
        this.balance = balance;
    }

    public void deposit( final int amount) {
        if ( (amount <= 0)) {
            System.out.println("the process of deposit not done");
            return;
        }
        balance += amount;
        System.out.println("the process of deposit is done successfully" + amount);
    }

    public void withDraw(final int amount)  {
        if ( (amount > balance)) {
            throw new CustomExceptions("this is not allowed");

        }
        balance -= amount;
        System.out.println("the process of withDraw is done successfully" + amount);

    }

    public void checkBalance() {
        System.out.println("current balance is = "+balance);
    }
}

