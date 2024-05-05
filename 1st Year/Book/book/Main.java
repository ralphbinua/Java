// Binua, Ralph Gabriel B.  1BSIT-5 InterProg

package book;

public class Main {
    public static void main(String[] args) throws Exception {
       
        Book book = new Book();

        System.out.print("\n\t Default Constructor\n");
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Year: " + book.getYearPublished());

        Book book1 = new Book("Java", "Ralph Binua", 2004);

        System.out.print("\n\t Parameterized Constructor\n");
        System.out.println("Title: " + book1.getTitle());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("Year: " + book1.getYearPublished());
    }
}