package objectorientedprogramming.javapolymorphismencapsulation.level1;

abstract class LibraryItem {
    protected String title;

    abstract int getLoanDuration();

    void getItemDetails() {
        System.out.println(title);
    }
}

interface Reservable {
    void reserveItem();
}

class Book extends LibraryItem implements Reservable {
    public Book(String title) {
        this.title = title;
    }

    int getLoanDuration() {
        return 14;
    }

    public void reserveItem() {
        System.out.println("Book Reserved");
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        LibraryItem item = new Book("Java");
        item.getItemDetails();
        System.out.println(item.getLoanDuration());
    }
}
