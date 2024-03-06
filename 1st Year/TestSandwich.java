public class TestSandwich {

    public static void main(String[] args) {
        Sandwich sandwich = new Sandwich();
        sandwich = getSandwich(sandwich);

        System.out.println("Main Ingredient of sandwich: " + sandwich.getMainIngredient());
        System.out.println("Bread type of sandwhich: " + sandwich.getBread());
        System.out.println("Price of sandwich: " + sandwich.getPrice());
    }

    public static Sandwich getSandwich(Sandwich sandwich) {
        sandwich.setMainIngredient("tuna", "wheat", 4.99);
        return sandwich;
    }
}
