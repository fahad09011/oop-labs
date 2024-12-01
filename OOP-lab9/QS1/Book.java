
public class Book extends LibraryItem implements LoanItem {
    private String author;
    private String title;
    private int numPages;

    // Constructor
    public Book(String ID, String author, String title, int numPages) {
        super("Book", ID); 
        this.author = author;
        this.title = title;
        this.numPages = numPages;
    }

    // Implementation of calculatePrice
    @Override
    public double calculatePrice() {
        return numPages * 0.10; 
    }

    @Override
    public String toString() {
        return super.toString() + ", Author: " + author + ", Title: " + title + ", Pages: " + numPages;
    }
}
