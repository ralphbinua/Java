// Binua, Ralph Gabriel B.  1BSIT-5 InterProg
package PhoneBook;
import java.io.*;
import java.util.*;

public class Phone {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        Phonebook ph = new Phonebook();

         int choice;
         do {
            System.out.println("My PhoneBook");
            System.out.print("Enter Choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    ph.addContact();
                    System.out.println();
                    break;
                case 2:
                    ph.viewContacts();
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Please enter again.");
            }
         } while (choice!=3);
    }
}
