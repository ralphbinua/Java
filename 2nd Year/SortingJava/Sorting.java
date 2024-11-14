package SortingJava;

import java.util.*;

public class Sorting {
    public static void main(String[] args) {
        Bubble bubble = new Bubble();
        Insertion insert = new Insertion();
        Scanner input = new Scanner(System.in);
        int choice;
        String fName, lName;

        System.out.print("Enter First Name: ");
        fName = input.next();
        System.out.print("Enter Last Name: ");
        lName = input.next();

        do {
            System.out.print("Enter the size of an array: ");
            int size = input.nextInt();

            int[] array = new int[size];

            System.out.println("Enter " + size + " integers:");
            for (int i = 0; i < size; i++) {
                array[i] = input.nextInt();
            }

            System.out.print("Menu\n");
            System.out.println("1. Bubble");
            System.out.println("2. Insertion");
            System.out.println("3. Selection");
            System.out.println("4. Merge Sort");
            System.out.println("5. Quick Sort");
            System.out.println("6. Heap Sort");
            System.out.println("7. Exit");

            System.out.print("Enter choice [1-7]: ");
            choice = input.nextInt();

            switch (choice) {
                case 1: {
                    bubble.BubbleSort(array);
                    System.out.println("Sorted array using Bubble Sort:");
                    System.out.println(Arrays.toString(array));
                    break;
                }
                case 2: {
                    insert.Insertion(array);
                    System.out.println("Sorted array using Insertion Sort:");
                    System.out.println(Arrays.toString(array));
                    break;
                }
                case 3: {

                    break;
                }
                case 4: {

                    break;
                }
                case 5: {

                    break;
                }
                case 6: {

                    break;
                }
                case 7: {
                    System.out.println("Exiting Mr. " +fName +lName);
                    break;
                }
                default: {
                    System.out.println("Invalid choice. Please try again.");
                }
            }
        } while (choice != 7);

    }
}
