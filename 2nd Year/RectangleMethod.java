// Binua, Ralph Gabriel B.  2BSIT-5 DSA

import java.util.Scanner;

public class RectangleMethod {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter Length: ");
    double length = input.nextDouble();
    
    System.out.print("Enter Width: ");
    double width = input.nextDouble();
    
    double area = length*width;
    double perimeter = (length+width)*2;
    System.out.println("Perimeter is " + perimeter+" meters");
    System.out.print("Area is " + area +" meters");
  }
}
