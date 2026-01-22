package Object_Oriented_Programming.javaLanguageConcepts.level1;

public class Book {

    static String libraryName = "City Library";

    String title;
    String author;
    final int isbn;

    Book(String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    static void displayLibraryName() {
        System.out.println(libraryName);
    }

    void displayBook() {
        System.out.println(title + " " + author + " " + isbn);
    }

    public static void main(String[] args) {

        Book b1 = new Book("Java", "James", 1234);

        if (b1 instanceof Book) {
            b1.displayBook();
        }

        Book.displayLibraryName();
    }
}
