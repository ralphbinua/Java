import java.util.Scanner;


public class ME_binua {
   public static void main(String[] args) {


       reverse reverseDsa = new reverse();
       balanced balancedDsa = new balanced();
       Scanner input = new Scanner(System.in);
       int choice;
       String word;


       do{


           System.out.println("Menu");
           System.out.println("1. Reverse word");
           System.out.println("2. Balancing the parenthesis");
           System.out.println("3. Exit");


           System.out.print("Enter choice: ");
           choice = input.nextInt();
           input.nextLine();


           switch (choice){
               case 1: {
                   System.out.print("Enter a word: ");
                   word = input.nextLine();
                   reverseDsa.hello(word);
                   System.out.println();
                   break;
               }
               case 2:{
                   System.out.print("Enter a string with parentheses: ");
                   word = input.nextLine();
                   boolean isBalanced = balancedDsa.isBalanced(word);


                   if (isBalanced) {
                       System.out.print("The parentheses are balanced.");
                   } else {
                       System.out.print("The parentheses are not balanced.");
                   }
                   System.out.println();
                   break;
               }
               case 3:{
                   break;
               }


               default: {
                   System.out.println("Invalid choice. Please try again.");
               }
           }


       }
       while (choice!=3);
   }
}
