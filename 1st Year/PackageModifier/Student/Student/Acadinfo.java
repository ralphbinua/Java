// Ralph Gabriel B. Binua 1BSIT-5 Inter Prog

package Student;
import java.text.DecimalFormat;

public class Acadinfo {
    
    public void displayEducDetails1(){
        DecimalFormat df = new DecimalFormat("#.00");

        // this will compute the fix value for displayEducDetails1

        int studentNumber = 2468;
        int quiz1=90;
        int quiz2=90;
        int midterm_grade=100;
        int final_grade=95;

        double average = (quiz1+quiz2+midterm_grade+final_grade)/4;
        double newAverage = Math.floor(average);

        int studentAttendance = 100;

        System.out.println("\nSTUDENT EDUCATIONAL DETAILS");
        System.out.println("Student Number " + studentNumber);
        System.out.println("Student Grade Average: " + df.format(newAverage));
        System.out.println("Student Attendance: " +studentAttendance+"%");
    }
}