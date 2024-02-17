// Ralph Gabriel B. Binua 1BSIT-5 Inter Prog

import Student.*; // importing student package
import Employee.*; // importing employee package

public class MainProgram {
    public static void main(String[] args) {
        
        Acadinfo acadinfo1 = new Acadinfo(); // creating object so it can access in this class

        for (int i = 0; i <= 1; i++) {
            Studentinfo studentinfo = new Studentinfo(); // creating object so it can access in this class
            studentinfo.Studentinfo(); // calling the class in that package and it will display here

            Emplyeeinfo emplyeeinfo = new Emplyeeinfo(); // creating object so it can access in this class
            emplyeeinfo.display_Employee(); // calling the class in that package and it will display here

            if (i == 0) {
                acadinfo1.displayEducDetails1();
            } else {
                Acadinfo2 acadinfo2 = new Acadinfo2(); // creating object so it can access in this class
                acadinfo2.displayEducDetail2(); // calling the class in that package and it will display here
            }
            
            if (i < 1) {
                System.out.println("\nNEXT STUDENT"); // for next student
            } else {
                System.out.println();
            }
        }
    }
}
