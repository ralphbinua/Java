public class Sandwich {

        String ingredient;
        String bread;
        double price;

        public void setMainIngredient(String ingredient, String bread, double price) {
                this.ingredient = ingredient;
                this.bread = bread;
                this.price = price;
        }
        public void setPrice(double price) {
                this.price = price;
        }
        public void setMainIngredient(String ingredient) {
                this.ingredient = ingredient;
        }
        public void setBreadType(String bread) {
                this.bread = bread;
        }
        public double getPrice() {
                return price;
        }
        public String getMainIngredient() {
                return ingredient;
        }
        public String getBread() {
                return bread;
        }
}
