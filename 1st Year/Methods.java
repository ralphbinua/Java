// Binua, Ralph Gabriel B. 1BSIT-5 Inter Prog

import java.util.Scanner;

public class Methods {

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int numOne = input.nextInt();

        System.out.print("Enter Second Number: ");
        int numTwo = input.nextInt();

        int twoNumber = one(numOne,numTwo);

        System.out.println(twoNumber);

        System.out.print("Enter Third number: ");
        int numThree = input.nextInt();

        System.out.print("Enter Fourth number: ");
        int numFour = input.nextInt();

        double oneNumber = two(numThree,numFour);

        System.out.print(oneNumber);

    }

    public static int one (int x, int y){
          if(x>y){
              int oneReturn = x+y;
              return oneReturn;
          }
          else{
              int twoReturn = (x-2)*y;
              return twoReturn;
          }

    }

    public static double two(int x, double a){
        int first;
        double z = x;

       z = z+a;

       first = one(6,8);

       first = first+x;

       if(z>first){
           return z;
       }else{
           return 2*first-z;
       }

    }
}
