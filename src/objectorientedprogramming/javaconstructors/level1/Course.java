package Object_Oriented_Programming.JavaConstructors.level1;

public class Course {
    String courseName;
    int duration;
    double fee;
    static String instituteName = "BridgeLabz";

    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    void displayCourseDetails() {
        System.out.println(courseName + " " + duration + " " + fee + " " + instituteName);
    }

    static void updateInstituteName(String name) {
        instituteName = name;
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java", 60, 15000);
        c1.displayCourseDetails();
        Course.updateInstituteName("BLZ");
        c1.displayCourseDetails();
    }
}
