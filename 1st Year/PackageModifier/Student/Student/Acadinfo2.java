// Ralph Gabriel B. Binua 1BSIT-5 Inter Prog

package Student;
import java.text.DecimalFormat;

public class Acadinfo2 {
    
    public void displayEducDetail2(){
        DecimalFormat df = new DecimalFormat("#.00");

        // this will compute the fix value for displayEducDetails2

        int studentNumber = 13579;
        int quiz1=80;
        int quiz2=80;
        int midterm_grade=85;
        int final_grade=90;

        double average = (quiz1+quiz2+midterm_grade+final_grade)/4;
        double newAverage = Math.floor(average);

        int studentAttendance = 98;

        System.out.println("\nSTUDENT EDUCATIONAL DETAILS");
        System.out.println("Student Number " + studentNumber);
        System.out.println("Student Grade Average: " + df.format(newAverage));
        System.out.println("Student Attendance: " +studentAttendance+"%");
    }
}