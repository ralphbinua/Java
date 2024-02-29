package OOP;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
    double account1, account2;
    static DecimalFormat df = new DecimalFormat("$###.00");

    public void debit() {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            double withdrawal;
            double account;

            if (i == 0) {
                System.out.print("\nEnter withdrawal amount for account1: ");
                withdrawal = input.nextDouble();
                account = account1;
            } else {
                System.out.print("\nEnter withdrawal amount for account2: ");
                withdrawal = input.nextDouble();
                account = account2;
            }

            if (withdrawal > account) {
                System.out.println("\nSubtracting " + df.format(withdrawal) + " from account balance");
                System.out.println("Debit amount exceeded from account balance");
            } else {
                System.out.println("\nSubtracting " + df.format(withdrawal) + " from account balance");
                if (i == 0) {
                    account1 -= withdrawal;
                } else {
                    account2 -= withdrawal;
                }
            }
            System.out.println("account1 balance: " + df.format(account1));
            System.out.println("account2 balance: " + df.format(account2));
        }
    }
}