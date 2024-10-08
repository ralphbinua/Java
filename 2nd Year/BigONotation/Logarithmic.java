public class Logarithmic {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 5;
        int result = Search(array, target); // O(log n) - takes time proportional to the logarithm of the input size
        System.out.println(result);
    }

    public static int Search(int[] array, int target) {
        int i = 0;
        int j = array.length - 1;
        while (i <= j) {
            int k = (i + j) / 2;
            if (array[k] == target) {
                return k;
            } else if (array[k] < target) {
                i = k + 1;
            } else {
                j = k - 1;
            }
        }
        return -1;
    }
}
