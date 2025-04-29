import java.util.*;

public class GradeCalculation {
    public static void main(String[] args) {

        //  Ralph Gabriel B. Binua 1BSIT-5 InterProg+

        // Declaring datatypes and variables
        String studentName, gradeScale = "";
       int mathGrade, scienceGrade, englishGrade, totalGrades = 0;

        Scanner input = new Scanner(System.in);

        // User input for name
        System.out.print("\nEnter the Student Name: ");
        studentName = input.nextLine();

        // User input for math, science, english grades
        System.out.println("Please Enter Numerical Values of the following Subjects:");

        System.out.print("Mathermatics: ");
        mathGrade = input.nextInt();

        System.out.print("Science: ");
        scienceGrade = input.nextInt();

        System.out.print("English: ");
        englishGrade = input.nextInt();

        // Total grades
        totalGrades = (englishGrade + mathGrade+ scienceGrade) / 3;

        if(totalGrades >100){
            gradeScale = "Invalid Input";
        }
        else if (totalGrades >= 90) {
            gradeScale = "A";
        } else if (totalGrades >= 80) {
            gradeScale = "B";
        }else if (totalGrades >= 70) {
            gradeScale = "C";
        }else if (totalGrades >= 60) {
            gradeScale = "D";
        }else if (totalGrades <= 59) {
            gradeScale = "F";
        }

        // Output of the Code

        System.out.println("\nHello " + studentName + ", your Grade is " + gradeScale +".");

    }
}
