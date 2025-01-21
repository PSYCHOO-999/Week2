class Book {
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    // Default constructor
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
        this.isAvailable = true;
    }

    // Parameterized constructor
    public Book(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    // Method to borrow a book
    public void borrowBook() {
        if (isAvailable) {
            System.out.println("The book \"" + title + "\" has been borrowed.");
            isAvailable = false;
        } else {
            System.out.println("Sorry, the book \"" + title + "\" is currently unavailable.");
        }
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: $" + price + ", Available: " + isAvailable);
    }
}

public class Lv01_Problem05_LibrarayMain {
    public static void main(String[] args) {
        // Default book
        Book defaultBook = new Book();
        defaultBook.displayDetails();
        defaultBook.borrowBook();
        defaultBook.borrowBook();

        // Custom book
        Book customBook = new Book("1984", "George Orwell", 9.99, true);
        customBook.displayDetails();
        customBook.borrowBook();
        customBook.borrowBook();
    }
}
