class Search {
  public static void main(String[] args) {
    int array[] = {1, 3, 5, 7, 8};
    int target = 5, size = 5;
    int index = 0, counter = 0;

    System.out.println("The original array elements are: \n");
    for (index = 0; index < size; index++) {
      System.out.println("array[" + index + "] = " + array[index]);
    }

    while (counter < size) {
      if (array[counter] == target) {
        break;
      }
      counter = counter + 1;
    }

    System.out.println("\nFound element " + target + " at a position " + counter + "\n");
  }
}
