// Binua, Ralph Gabriel B. 1BSIT-5 Inter Prog

import java.util.Scanner;
import java.text.*;

public class Main {
    public static void main(String[] args) {

        String name;
        double kilograms,meters;

        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("##.##");

        System.out.println("Welcome to BMIC!");

        System.out.print("May I know your name? ");
        name = input.nextLine();

        System.out.println("Hi, " + name + "! Let's compute your BMI");
        System.out.print("What is your current weight in Kg? ");
        kilograms = input.nextDouble();

        System.out.print("What is your current height in meters? ");
        meters = input.nextDouble();

        double bmiCalc = bmiCalculator(kilograms, meters);

        System.out.println("Your BMI is "+df.format(bmiCalc));
     System.out.print("With your current height and weight, you are ");
    bmioutputMessage(bmiCalc);

    System.out.print("Thank you!");
    }
    public static double bmiCalculator(double kg, double mt) {
        double bmiCalculation = (kg/(mt*mt));

        return bmiCalculation;
    }
    public static double bmioutputMessage(double output){

        if(output >= 30.){
            System.out.print("very overweight");
        } else if (output<=29.0) {
            System.out.print("overweight");
        } else if (output<=24.9) {
            System.out.print("normal");
        } else{
            System.out.print("underweight");
        }

        return output;
    }
}
