class Update {
    public static void main(String[] args) {
        int numbers[] = {1, 3, 5, 7, 8};
        int targetIndex = 3, totalElements = 5, updatedValue = 10;
        int loopIndex;

        System.out.println("The original array elements are: \n");
        for (loopIndex = 0; loopIndex < totalElements; loopIndex++) {
            System.out.println("numbers[" + loopIndex + "] = " + numbers[loopIndex]);
        }
        numbers[targetIndex - 1] = updatedValue;

        System.out.println("\nThe array elements after updation: \n");
        for (loopIndex = 0; loopIndex < totalElements; loopIndex++) {
            System.out.println("numbers[" + loopIndex + "] = " + numbers[loopIndex]);
        }
    }
}
