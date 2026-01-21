package Object_Oriented_Programming.JavaConstructors.level1;

public class BookLibrary {
    String title;
    String author;
    double price;
    boolean available;

    BookLibrary(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }

    void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book borrowed");
        } else {
            System.out.println("Book not available");
        }
    }

    public static void main(String[] args) {
        BookLibrary b = new BookLibrary("Java", "James", 400);
        b.borrowBook();
        b.borrowBook();
    }
}
