// Binua, Ralph Gabriel B.  2BSIT-5 DSA

import java.util.Scanner;
import java.text.*;

public class TopSportsMan {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
     DecimalFormat df = new DecimalFormat("$###,###,###.##");
    
    String athlete1, athlete2, athlete3, athlete4, athlete5;
    double sales1, sales2, sales3, sales4, sales5;
    
    System.out.print("Enter athlete 1: ");
    athlete1 = input.nextLine();
    System.out.print("Enter sales: ");
    sales1 = input.nextDouble();
    
      System.out.println();
    System.out.print("Enter athlete 2: ");
    athlete2 = input.next();
    System.out.print("Enter sales: ");
    sales2 = input.nextDouble();
    
    System.out.println();
    System.out.print("Enter athlete 3: ");
    athlete3 = input.next();
    System.out.print("Enter sales: ");
    sales3 = input.nextDouble();
    
    System.out.println();
    System.out.print("Enter athlete 4: ");
    athlete4 = input.next();
    System.out.print("Enter sales: ");
    sales4 = input.nextDouble();
    
    System.out.println();
    System.out.print("Enter athlete 5: ");
    athlete5 = input.next();
    System.out.print("Enter sales: ");
    sales5 = input.nextDouble();
    
    System.out.println();
    System.out.println("Top SportsMan");
    System.out.println("Name\t\tSales");
    System.out.println("=====================");
    
    System.out.println(athlete1 +"\t" +df.format(sales1));
    System.out.println(athlete2 +"\t" +df.format(sales2));
    System.out.println(athlete3 +"\t" +df.format(sales3));
    System.out.println(athlete4 +"\t" +df.format(sales4));
    System.out.println(athlete5 +"\t" +df.format(sales5));
    
    System.out.println("=====================");
    System.out.println("Total\t" + df.format(sales1+sales2+sales3+sales4+sales5));
    
  }
}
