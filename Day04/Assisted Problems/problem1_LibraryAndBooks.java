import java.util.ArrayList;

// Book Class
class Book {
    private String title;
    private String author;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String toString() {
        return "Book{Title='" + title + "', Author='" + author + "'}";
    }
}

// Library Class
class Library {
    private String name;
    private ArrayList<Book> books;

    // Constructor
    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    // Add Book to Library
    public void addBook(Book book) {
        books.add(book);
    }

    // Display Books in Library
    public void displayBooks() {
        System.out.println("Library: " + name);
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
}

// Main Class
public class problem1_LibraryAndBooks {
    public static void main(String[] args) {
        // Create Books
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee");

        // Create Libraries
        Library library1 = new Library("City Library");
        Library library2 = new Library("Community Library");

        // Add Books to Libraries
        library1.addBook(book1);
        library1.addBook(book2);

        library2.addBook(book2); // Same book can exist in another library
        library2.addBook(book3);

        // Display Library Contents
        library1.displayBooks();
        library2.displayBooks();
    }
}
