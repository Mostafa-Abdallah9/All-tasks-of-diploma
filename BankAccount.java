package io.encapsulation;

import java.util.Objects;

public class BankAccount {
    private final String ownerName;
    private final String countryName;
    private  float balance;

    public BankAccount(String ownerName, String countryName, float balance) {
        this.ownerName = ownerName;
        this.countryName = countryName;
        this.balance = balance;
    }

    public float deposit(final float amount) {
        balance += amount;
        return balance;
    }

    public float withdraw(final float amount) throws IllegalArgumentException{
        if (amount > 20000f) {
            throw new IllegalArgumentException("dont drawwith more than 2000LE");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient balance");
        }
            balance -= amount;
        return balance;

    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getCountryName() {
        return countryName;
    }


    @Override
    public String toString() {
        return "BankAccount{" +
                "ownerName='" + ownerName + '\'' +
                ", countryName='" + countryName + '\'' +
                ", balance=" + balance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return Float.compare(balance, that.balance) == 0 && Objects.equals(ownerName, that.ownerName) && Objects.equals(countryName, that.countryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ownerName, countryName, balance);
    }
}
