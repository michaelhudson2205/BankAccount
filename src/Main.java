import accounts.*;

import java.util.ArrayList;

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
//        CheckingAccount ca = new CheckingAccount(100, 0.037, 500);
//        SavingsAccount sa = new SavingsAccount(100, 0.045);
//
//        ca.status();
//        sa.status();
//
//        ca.withdraw(10);
//        sa.withdraw(10);
//
//        ca.status();
//        sa.status();
//        SilverCheckingAccount silver = new SilverCheckingAccount(5000, 0.025, 1000);
//        GoldCheckingAccount gold = new GoldCheckingAccount(5000, 0.025, 1000);
//        DiamondCheckingAccount diamond = new DiamondCheckingAccount(5000, 0.025, 1000);
//
//        System.out.println(silver.getRewardPoints());
//        System.out.println(gold.getRewardPoints());
//        System.out.println(diamond.getRewardPoints());
//
//        silver.purchase(3500);
//        gold.purchase(3500);
//        diamond.purchase(3500);
//
//        System.out.println(silver.getRewardPoints());
//        System.out.println(gold.getRewardPoints());
//        System.out.println(diamond.getRewardPoints());

        Account account1 = new SavingsAccount(500, 0.025);
        CheckingAccount account2 = new GoldCheckingAccount(1000, 0.032, 2500);
        Account account3 = new SilverCheckingAccount(280, 0.029, 1770);

//        account1.status();
//        account1.withdraw(90);
//        account1.status();

//        account3.status();

        ArrayList<Account> accounts = new ArrayList<>();
        accounts.add(new SilverCheckingAccount(450, 0.015, 957));
        accounts.add(new DiamondCheckingAccount(3200, 0.053, 19504));
        accounts.add(new SavingsAccount(7241, 0.044));
        accounts.add(new GoldCheckingAccount(5527, 0.038, 4823));
        accounts.add(new CheckingAccount(838, 0.026, 7339));
        accounts.add(new SavingsAccount(992, 0.040));
        accounts.add(new Account(340, 0.019));

        for (Account account : accounts) {
            account.status();
            System.out.println();
        }

    }
}
