// Binua, Ralph Gabriel B.  1BSIT-5 Inter Prog

import java.util.Scanner;

public class Percentage {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double fNumber,sNumber, percentageOne,percentageTwo;

    System.out.print("Enter First Number: ");
    fNumber = input.nextDouble();

    System.out.print("Enter Second Number: ");
    sNumber = input.nextDouble();

    percentageOne = computePercentage(fNumber, sNumber);
    percentageTwo = computePercentage(sNumber, fNumber);
    System.out.println(percentageOne);
    System.out.println(percentageTwo);
   } 

   public static double computePercentage(double numOne, double numTwo){
            double percent = (numOne/numTwo)*100;
         return percent;
   }
}
