class Deletion {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 8};
        int indexToDelete = 3; 
        int arrayLength = 5;

        System.out.println("The original array elements are:");
        printArray(numbers, arrayLength);

        arrayLength = deleteElement(numbers, arrayLength, indexToDelete);

        System.out.println("\nThe array elements after deletion:");
        printArray(numbers, arrayLength); 
    }

    static int deleteElement(int[] arr, int size, int indexToDelete) {
        if (indexToDelete < 0 || indexToDelete >= size) {
            System.out.println("Invalid deletion index.");
            return size; 
        }

        for (int i = indexToDelete; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }

        return size - 1;
    }

    static void printArray(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.println("numbers[" + i + "] = " + arr[i]);
        }
    }
}
