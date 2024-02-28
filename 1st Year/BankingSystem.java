// Ralph Gabriel B. Binua   1BSIT-5 Inter Prog

import java.util.Scanner;

public class BankingSystem {
    public static void main(String[] args) {

        int gaNumber = 126241146;
        int initialDeposit, transactFee, newMoney, moneyDeposit, option, moneyCheck;
        String accountType, bankSystem;

        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.print("Enter the Name: ");
        String nameClient = input.nextLine();

        System.out.print("Initial Deposit: ");

        if (input.hasNextInt()) {
            initialDeposit = input.nextInt();
            input.nextLine();
            if (initialDeposit >= 100) {
                System.out.println("Generated Account Number: " + gaNumber);
            } else {
                System.out.println("Invalid initial deposit.");
                return;
            }
        } else {
            System.out.print("Invalid Input");
            return;
        }

        System.out.println();
        System.out.print("ABCD Bank System\n[Y = Enter / N = Exit]: ");
        bankSystem = input.nextLine();

        switch (bankSystem.toUpperCase()) {
            case "Y":
                System.out.println("\nWelcome to ABCD Bank System");
                System.out.println("\nHello " + nameClient);

                if (initialDeposit >= 100 && initialDeposit <= 100000) {
                    accountType = "Regular Account";
                    transactFee = 10;
                } else if (initialDeposit > 100000 && initialDeposit <= 1000000) {
                    accountType = "Gold Account";
                    transactFee = 8;
                } else if (initialDeposit > 1000000) {
                    accountType = "Platinum Account";
                    transactFee = 0;
                } else {
                    System.out.println("Invalid initial deposit.");
                    return;
                }

                System.out.println("Account Type: " + accountType);
                System.out.println("Transaction Fee: " + transactFee);
                System.out.println("Account Number: " + gaNumber);

                newMoney = initialDeposit;

                do {

                    System.out.println();
                    System.out.println("[1] Deposit Money");
                    System.out.println("[2] Withdraw Money");
                    System.out.println("[3] Check Current Balance");
                    System.out.println("[4] Exit");

                    System.out.println();
                    System.out.print("Options: ");
                    option = input.nextInt();
                    input.nextLine();

                    switch (option) {
                        case 1:
                            System.out.println();
                            System.out.print("Enter Money to deposit: ");
                            moneyDeposit = input.nextInt();
                            input.nextLine();

                            newMoney = (newMoney + moneyDeposit) - transactFee;
                            System.out.println("New Balance: " + newMoney);
                            break;

                        case 2:
                            System.out.println();
                            System.out.print("Enter Money to withdraw: ");
                            moneyDeposit = input.nextInt();
                            input.nextLine();

                            if (moneyDeposit <= newMoney) {
                                newMoney = (newMoney - moneyDeposit) - transactFee;
                                System.out.println("New Balance: " + newMoney);
                            } else {
                                System.out.println("Insufficient funds.");
                            }
                            break;

                        case 3:
                            System.out.println();
                            moneyCheck = newMoney - transactFee;
                            System.out.println("Your balance is: " + moneyCheck);
                            break;

                        case 4:
                            System.out.println();
                            System.out.println("Thank you for using ABCD Bank System");
                            return;

                        default:
                            System.out.println("Invalid option. Please enter a valid option.");
                            break;
                    }
                } while (option != 4);
                break;

            case "N":
                return;

            default:
                System.out.println("Invalid option. Please enter either Y or N.");
                break;
        }
    }
}
