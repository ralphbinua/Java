import java.util.Arrays;

public class Cubic {
    public static void findTriplets(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        System.out.println("Triplet: " + arr[i] + ", " + arr[j] + ", " + arr[k]);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, -1, 2, -3, 1};
        findTriplets(arr);
    }
}
