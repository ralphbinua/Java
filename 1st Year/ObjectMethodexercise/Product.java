// Binua, Ralph Gabriel B.  1BSIT-5 InterProg

package ObjectMethodexercise;

public class Product {
    
    private String name;
    private double price;
    private int quantity;

    public Product(String name, String string, int quantity){
        this.name = name;
        this.price = price;
        this.quantity =quantity;

    }
    public double calculateTotalCost(){
        return price * quantity;
    }

    public String introduceProduct(){
        return "Product: " + name + ", Price: $" + String.format("%.2f", price) + ", Quantity: " + quantity;
    }

    @Override

    public String toString(){
        return introduceProduct();
    }
}
