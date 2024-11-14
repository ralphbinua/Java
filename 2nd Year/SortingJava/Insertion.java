package SortingJava;

import java.util.Arrays;

public class Insertion {
    public void Insertion(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i]; // Element to be inserted
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
            System.out.println("After inserting " + key + ": " + Arrays.toString(array));
        }
    }
}
