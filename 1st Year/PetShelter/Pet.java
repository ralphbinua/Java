// Binua, Ralph Gabriel B.  1BSIT-5 InterProg

package PetShelter;

public class Pet {
    public static void main(String[] args) {
        
        Dog dog = new Dog("Cookie", "Aspin", 3, "Ralph");
        System.out.println();
        dog.bark();
        dog.greet();
        dog.play();

        Dog dog2 = new Dog("Midnight", "Bulldog", 5, "Gabby");
        System.out.println();
        dog2.bark();
        dog2.greet();
        dog2.play();

        Dog dog3 = new Dog("Spike", "Husky", 1, "Cherry");
        System.out.println();
        dog3.bark();
        dog3.greet();
        dog3.play();
    }
}
