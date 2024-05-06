// Binua, Ralph Gabriel B.  1BSIT-5 InterProg

package Lec;

public class Author {
     private String name;
     private String email;
     private char gender;

     public Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
     }

     public void setName(String name ){
        this.name = name;
     }

     public void setEmail(String email){
        this.email = email;
     }

     public void setGender(char gender){
        this.gender = gender;
     }

     public String getName(){
        return name;
     }

     public String getEmail(){
        return email;
     }

     public char getGender(){
        return gender;
     }

     public void print() {
        System.out.println("Author Name: " + name);
        System.out.println("Author Email: " + email);
        System.out.println("Author Gender: " + gender);
    }
}
