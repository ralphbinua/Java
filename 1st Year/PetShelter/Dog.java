// Binua, Ralph Gabriel B.  1BSIT-5 InterProg

package PetShelter;

public class Dog {
    private String dogName;
    private String dogBreed;
    private int dogAge;
    private String dogOwner;

    public Dog(String dogName, String dogBreed, int dogAge, String dogOwner){
        this.dogName = dogName;
        this.dogBreed = dogBreed;
        this.dogAge = dogAge;
        this.dogOwner = dogOwner;
    }

    public void setDogName(String dogName){
        this.dogName = dogName;
    }

    public void setDogBreed(String dogBreed){
        this.dogBreed = dogBreed;
    }

    public void setDogAge(int dogAge){
        this.dogAge = dogAge;
    }

    public void setDogOwner(String dogOwner){
        this.dogOwner = dogOwner;
    }

    public String getDogName(){
        return dogName;
    }

    public String getDogBreed(){
        return dogBreed;
    }

    public int getDogAge(){
        return dogAge;
    }

    public String getDogOwner(){
        return dogOwner;
    }

    public void bark(){
        System.out.println(dogName + " says Woof!");
    }

    public void greet(){
        System.out.println("Arf! Arf! Arf! Hi, " + dogOwner + ". I am " + dogName + ", let's play fetch!");
        System.out.println(dogOwner +" throw's the ball!");
    }

    public void play(){
        System.out.println(dogName + " is fetching the ball!");
    }
}
