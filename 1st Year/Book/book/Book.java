// Binua, Ralph Gabriel B.  1BSIT-5 InterProg

package book;

public class Book {
    private String title;
    private String author;
    private int yearPublished;

    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.yearPublished = 0;
    }

    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setYear(int yearPublished){
        this.yearPublished = yearPublished;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getYearPublished(){
        return yearPublished;
    }
}