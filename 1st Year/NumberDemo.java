// Binua, Ralph Gabriel B.  1BSIT-5 Inter Prog

import java.util.Scanner;

public class NumberDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int twice;

        System.out.print("\nEnter First Number: ");
        int numOne = input.nextInt();

        System.out.print("Enter Second Number: ");
        int numTwo = input.nextInt();

        twice = displayTwiceTheNumber(numOne, numTwo);
        twice = displayNumberPlusFive(numOne, numTwo);
        twice = displayNumberSquared(numOne, numTwo);
    }

    public static int displayTwiceTheNumber(int one, int two) {
        int newOne = one * 2;
        int newTwo = two * 2;

        System.out.println();
        System.out.println("Twice the number " + one + " is: " + newOne);
        System.out.println("Twice the number " + two + " is: " + newTwo);
        return newOne;
    }

    public static int displayNumberPlusFive(int one, int two) {
        int newOne = one +5;
        int newTwo = two +5;

        System.out.println();
        System.out.println("The number " + one + " plus five is: " + newOne);
        System.out.println("Twice the number " + two + " plus five is: " + newTwo);
        return newOne;
    }

    public static int displayNumberSquared(int one, int two) {
        int newOne = one *one;
        int newTwo = two *one;

        System.out.println();
        System.out.println("The square of the number " + one + " is: " + newOne);
        System.out.println("The square of the number " + two + " is: " + newTwo);
        return newOne;
    }
}
