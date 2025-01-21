class Book {
    public String ISBN;
    protected String title;
    private String author;

    // Constructor
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Setter for author
    public void setAuthor(String author) {
        this.author = author;
    }

    public void displayDetails() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title + ", Author: " + author);
    }
}

class EBook extends Book {
    private double fileSize;

    public EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    public void displayEBookDetails() {
        System.out.println("EBook - ISBN: " + ISBN + ", Title: " + title + ", File Size: " + fileSize + "MB");
    }
}

class Lv01_Problem02_LibrarayMain {
    public static void main(String[] args) {
        Book book = new Book("123456789", "Java Programming", "John Doe");
        book.displayDetails();

        EBook ebook = new EBook("987654321", "Advanced Java", "Jane Doe", 5.5);
        ebook.displayEBookDetails();
    }
}
