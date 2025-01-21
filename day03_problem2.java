public class day03_problem2 {

    static class Book {
        private static String libraryName = "City Library"; // Shared across all books
        private final String isbn; // Final variable for unique identifier
        private String title;
        private String author;

        // Constructor
        public Book(String title, String author, String isbn) {
            this.title = title;
            this.author = author;
            this.isbn = isbn; // Using 'this' to initialize unique identifier
        }

        // Static method to display library name
        public static void displayLibraryName() {
            System.out.println("Library Name: " + libraryName);
        }

        // Static method to update library name
        public static void updateLibraryName(String newLibraryName) {
            libraryName = newLibraryName;
        }

        // Method to display book details
        public void displayBookDetails() {
            if (this instanceof Book) { // Using 'instanceof' to verify type
                System.out.println("Book Title: " + title);
                System.out.println("Author: " + author);
                System.out.println("ISBN: " + isbn);
            } else {
                System.out.println("Invalid book object.");
            }
        }
    }

    public static void main(String[] args) {
        // Directly initializing values
        String title = "Java Programming";
        String author = "John Smith";
        String isbn = "978-1234567890";

        Book book = new Book(title, author, isbn);

        System.out.println("--- Library Details ---");
        Book.displayLibraryName();

        System.out.println("\n--- Book Details ---");
        book.displayBookDetails();

        // Updating library name directly
        String newLibraryName = "Central Library";
        Book.updateLibraryName(newLibraryName);

        System.out.println("\n--- Updated Library Details ---");
        Book.displayLibraryName();
    }
}
