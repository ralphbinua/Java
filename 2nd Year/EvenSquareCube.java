// Binua, Ralph Gabriel B.  2BSIT-5 DSA

public class EvenSquareCube {
  public static void main(String[] args) {
    int square_total = 0;
    int cube_total = 0;

    System.out.println("Number\tSquare\tCube");

    for (int i = 2; i <= 10; i += 2) {
      int square = i * i;
      int cube = i * i * i;

      System.out.println(i + "\t\t" + square + "\t\t" + cube);

      square_total += square;
      cube_total += cube;
    }

    System.out.println("Total\t" + square_total + "\t\t" + cube_total);
  }
}
