class Traverse {
  public static void main(String[] args) {
    int myArray[] = {1,2,5,7,8};
    int target = 10, position=3, size=5;
    int index = 0, end=size;
    System.out.println("The original array elements are: \n");
    for (index=0; index<size; index++){
      System.out.println("myArray[" + index+ "] = " + myArray[index]);
    }
  }
}
