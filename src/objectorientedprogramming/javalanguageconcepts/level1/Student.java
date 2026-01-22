package Object_Oriented_Programming.javaLanguageConcepts.level1;

public class Student {

    static String universityName = "XYZ University";
    static int totalStudents = 0;

    String name;
    final int rollNumber;
    char grade;

    Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    void displayStudent() {
        System.out.println(name + " " + rollNumber + " " + grade);
    }

    public static void main(String[] args) {

        Student s1 = new Student("Karthik", 10, 'A');

        if (s1 instanceof Student) {
            s1.displayStudent();
        }

        Student.displayTotalStudents();
    }
}
