import accounts.Account;
import accounts.CheckingAccount;
import accounts.SavingsAccount;

public class Main {
    public static void main(String[] args) {
//        Account account = new Account(100, 0.025);
//        account.status();
//        account.withdraw(45.86);
//        account.status();
//        account.withdraw(62.96);
//        account.status();
//        account.deposit(32.50);
//        account.status();
//        CheckingAccount account = new CheckingAccount(100, 0.042, 700);
//        System.out.println(account.getRewardPoints());
//        if (account.purchase(18.63)) {
//            System.out.println("Purchase successful");
//        } else {
//            System.out.println("Purchase failed");
//        }
//        System.out.println(account.getRewardPoints());
        CheckingAccount ca = new CheckingAccount(100, 0.037, 500);
        SavingsAccount sa = new SavingsAccount(100, 0.045);

        ca.status();
        sa.status();

        ca.withdraw(10);
        sa.withdraw(10);

        ca.status();
        sa.status();
    }
}
