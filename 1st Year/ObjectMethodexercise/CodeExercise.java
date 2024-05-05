// Binua, Ralph Gabriel B.  1BSIT-5 InterProg

package ObjectMethodexercise;

public class CodeExercise {
    public static void main(String[] args) {
        
        Product shirt = new Product ("Shirt", "19.99", 5);

        double totalCost = shirt.calculateTotalCost();
        String productInfo = shirt.introduceProduct();

        System.out.println("Total Cost: $" + totalCost);
        System.out.println(productInfo);

        System.out.println(shirt);
    }
}
