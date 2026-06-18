package inter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Bank {
   private final List<Account> accounts=new ArrayList<>();

   public void addAccount(final Account account) {
       accounts.add(account);
   }

    public void showAllAccounts() {
    for (Account account : accounts) {
    System.out.println(account);
    }
    }

    public Account getAccount(final int index) {
        return accounts.get(index);
    }

    public double getTotalBalance() {
        double total = 0;
        for (Account account : accounts) {
            total += account.viewBalance();
        }
        return total;
    }

}
