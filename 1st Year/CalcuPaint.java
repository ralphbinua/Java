// Binua, Ralph Gabriel B.  1BSIT-5 Inter Prog

import java.util.Scanner;
import java.text.*;

public class CalcuPaint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###");

        double totalArea,totalGallon,totalPrice;
        int length,width,height;

        System.out.print("\nEnter the Lenght of the Room in feet: ");
        length = input.nextInt();

        System.out.print("Enter the Width of the Room in feet: ");
        width = input.nextInt();

        System.out.print("Enter the Height of the Room in feet: ");
        height = input.nextInt();
        
        totalArea = calculateArea(length, width, height);
       totalGallon = gallonNeeded(totalArea);
        totalPrice = totalPrice(totalGallon);

        System.out.println("The cost to paint a "+ length+"-by-"+width+"-foot room with "+height+" foot ceilings is Php"+ df.format(totalPrice)+".");
    }

    public static double calculateArea(double length,double width, double height){
        double totalArea;

        totalArea = 2*(length+width)*height;

        return totalArea;
    }

    public static double gallonNeeded(double totalArea){
double gallonNeed;
        gallonNeed = totalArea/350;

        return gallonNeed;
    }

    public static double totalPrice(double totalPrice){
        double totalPrices;
            totalPrices = totalPrice*1800;

        return totalPrices;
    }
}
