// Ralph Gabriel B. Binua 1BSIT-5 Inter Prog

package Student;

import java.util.Scanner;

public class Studentinfo {
    
    public void Studentinfo(){

         // this package will ask to user to input Employee Details

        Scanner input = new Scanner(System.in);
        
        String studentName,studentGender, studentAddress, studentFather, studentMother; // declare variables
        int age,studentContactNumber;

        System.out.println("\nSTUDENT DETAILS");

        System.out.print("Student Name: ");
        studentName = input.nextLine();

        System.out.print("Age: ");
        age = input.nextInt();
        input.nextLine();

        System.out.print("Student Gender: ");
        studentGender = input.nextLine();

        System.out.print("Student Address: ");
        studentAddress = input.nextLine();

        System.out.print("Contact Number: ");
        studentContactNumber = input.nextInt();
        input.nextLine();

        System.out.print("Father's Name: ");
        studentFather = input.nextLine();

        System.out.print("Mother's Name is: ");
        studentMother = input.nextLine();
    }
}
