package OOP;
import java.text.DecimalFormat;

public class AccountRun {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("$###.00");
        Account account = new Account();

        account.account1 = 150;
        account.account2 = 500.53;

        System.out.println("account1 balance: " + df.format(account.account1));
        System.out.println("account2 balance: " + df.format(account.account2));
        account.debit();
    }
}