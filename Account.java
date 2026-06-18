package inter;

public interface Account {

    double deposit(final double amount);

    double withdraw(final double amount);

    double calculateInterest();

    double viewBalance();
}
