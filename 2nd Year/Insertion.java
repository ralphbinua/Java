class Insertion {
    public static void main(String[] args) {
        int numbers[] = {1, 3, 5, 7, 8};
        int value = 10, location = 3, length = 5;
        int counter = 0, endPosition = length;

        System.out.println("The original array elements are: \n");
        for (counter = 0; counter < length; counter++) {
            System.out.println("numbers[" + counter + "] = " + numbers[counter]);
        }

        int newLength = length + 1;

        while (endPosition >= location) {
            if (endPosition + 1 < numbers.length) {
                numbers[endPosition + 1] = numbers[endPosition];
            }
            endPosition = endPosition - 1;
        }

        numbers[location] = value;

        System.out.println("\nThe array elements after insertion: \n");
        for (counter = 0; counter < length; counter++) {
            System.out.println("numbers[" + counter + "] = " + numbers[counter]);
        }
    }
}
