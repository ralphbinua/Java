// Binua, Ralph Gabriel B.  1BSIT-5 InterProg

package PhoneBook;
import java.io.*;
import java.util.*;

public class Phonebook {
   private Scanner input;
   private static File csv =  new File("C:\\Users\\Binua Family\\Desktop\\Java\\MyProjects\\src\\PhoneBook\\phonebook.csv");
   private String list ="";

   class Contact{
    private String name;
    private String phoneNumber;
    

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
   }

    public void addContact(){ 
        input = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter Contact Name: ");
        String name = input.nextLine();
        System.out.print("Enter PhoneNumber: ");
        String number = input.nextLine();
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(csv, true))){
            writer.write(name + "," + number);
            writer.newLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void viewContacts() throws IOException{

        try {
            BufferedReader reader = new BufferedReader(new FileReader(csv));

            while((list = reader.readLine()) != null){
                String [] listContact = list.split(",");
                System.out.println();
                System.out.println("Name: " + listContact[0]);
                System.out.println("PhoneNumber: " + listContact[1]);
            }
        } catch (FileNotFoundException e) {           
        }
    }
}
