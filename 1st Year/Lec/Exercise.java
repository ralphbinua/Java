// Binua, Ralph Gabriel B.  1BSIT-5 InterProg
package Lec;
public class Exercise {
    public static void main(String[] args) {
        
     Author author = new Author("ralph","binua",'m');
     author.print();

     Book book = new Book("java", author, 19,20);
     book.print();
    }
}
