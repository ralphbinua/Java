package SortingJava;

import java.util.Arrays;

public class Bubble {
    public static int[] BubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            boolean swapped = false;
            System.out.println("Pass " + (i + 1) + ":");
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                    System.out.println("Swapped " + arr[j + 1] + " and " + arr[j] + ": " + arrayToString(arr));
                }
            }
            if (!swapped) {
                break;
            }
        }
        return arr;
    }
    private static String arrayToString(int[] arr) {
        return Arrays.toString(arr);
    }
}
