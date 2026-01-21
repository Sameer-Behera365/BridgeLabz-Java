package Object_Oriented_Programming.JavaConstructors.level1;

public class BookAM {
    public String ISBN;
    protected String title;
    private String author;

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}

class EBook extends BookAM {
    void display() {
        System.out.println(ISBN + " " + title);
    }
}
