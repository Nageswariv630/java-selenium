package tasks1;

//Book.java
public class Book {
 // Fields
 String title;
 String author;
 double price;

 // Constructor
 public Book(String title, String author, double price) {
     this.title = title;
     this.author = author;
     this.price = price;
 }

 // Method to display book details
 public void displayDetails() {
     System.out.println("Title : " + title);
     System.out.println("Author: " + author);
     System.out.println("Price : $" + price);
     System.out.println();
 }

 // Main method
 public static void main(String[] args) {
     // Create two book objects
     Book book1 = new Book("java ", " James Gosling", 12.99);
     Book book2 = new Book("The Diary of a Cricketer’s Wife: A Very Unusual Memoir", "puja pujara", 10.50);

     // Display book details
     System.out.println("Book 1 Details:");
     book1.displayDetails();

     System.out.println("Book 2 Details:");
     book2.displayDetails();
 }
}

