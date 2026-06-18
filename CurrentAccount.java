package inter;

import java.util.Objects;

public class CurrentAccount implements Account{
    private double balance;

    public CurrentAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public double deposit(final double amount) {
        this.balance +=amount;
        return this.balance;
    }

    @Override
    public double viewBalance() {
        return this.balance;
    }

    @Override
    public double calculateInterest() {
        return 0;
    }

    @Override
    public double withdraw(final double amount) throws IllegalArgumentException {
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient balance");
        }
        this.balance -= amount;
        return this.balance;

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof CurrentAccount that)) return false;
        return Double.compare(balance, that.balance) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(balance);
    }

    @Override
    public String toString() {
        return "CurrentAccount{" +
                "balance=" + balance +
                '}';
    }
}
