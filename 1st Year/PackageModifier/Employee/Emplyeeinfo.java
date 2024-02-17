// Ralph Gabriel B. Binua 1BSIT-5 Inter Prog

package Employee;
import java.util.Scanner;

public class Emplyeeinfo {
    public void display_Employee(){

        // this package will ask to user to input Employee Details

        Scanner input = new Scanner(System.in);

        String employeeName, designation,academicPosition;

        System.out.println("\nEMPLOYEE'S DETAILS");

        System.out.print("Employee Name: ");
        employeeName = input.nextLine();

        System.out.print("Designation: ");
        designation = input.nextLine();

        System.out.print("Academic Position: ");
        academicPosition = input.nextLine();
    }
}