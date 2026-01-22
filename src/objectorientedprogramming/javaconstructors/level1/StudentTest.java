package objectorientedprogramming.javaconstructors.level1;

public class StudentTest {
    public static void main(String[] args) {

        PostgraduateStudent p = new PostgraduateStudent();

        p.rollNumber = 1;
        p.name = "Einstein";
        p.setCgpa(8.9);

        p.display();
    }
}
