package PMSystem;
public class Book extends Product {
    private String author;
    private String genre;

    public Book(String id, String name, double price, String author, String genre, int stockQty) {
        super(id, name, price, stockQty);
        this.author = author;
        this.genre = genre;
    }

    @Override
    public void displayDetails() {
        System.out.println("Book: " + name + " by " + author + " (Genre: " + genre + ")");
    }
}