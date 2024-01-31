public class ReverseString {
    public static void main(String[] args) {
        
        String name = "dog"; // i create a string with a value of dog
        char [] pet = name.toCharArray(); // it convert the String to char and transfer it to an arrays

        // i is equal to the length of pet-1, if the i is greather or equal to 0
        // then will print the last letter in that array then it will subtract 1 on it after the print
        for(int i = pet.length-1; i>=0; i--){
            System.out.print(pet[i]); // display the output
        }
    }
}
