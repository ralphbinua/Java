// Binua, Ralph Gabriel B.  1BSIT-5 InterProg

package Lec;

public class Book {

    private String bookTitle;
    private Author author;
    private double price;
    private int stock;

    public Book(String bookTitle, Author author,double price ,int stock){
        this.bookTitle = bookTitle;
        this.author = author;
        this.price = price;
        this.stock =stock;
    }

    public void setBookTitle(String bookTitle ){
        this.bookTitle = bookTitle;
     }

     public void setAuthor(Author author){
        this.author = author;
     }

     public void setPrice(double price){
        this.price = price;
     }

     public void setStock(int stcok){
        this.stock = stock;
     }

     public String getBookTitle(){
        return bookTitle;
     }

     public Author getAuthor(){
        return author;
     }

     public double getPrice(){
        return price;
     }

     public int getStock(){
        return stock;
     }

     public void print() {
      System.out.println("\nBook Title: " + bookTitle);
      author.print();
}
}