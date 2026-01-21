package Object_Oriented_Programming.JavaConstructors.level1;

public class Student {
    public int rollNumber;
    protected String name;
    private double cgpa;

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public double getCgpa() {
        return cgpa;
    }
}

class PostgraduateStudent extends Student {
    void display() {
        System.out.println(rollNumber + " " + name);
    }
}
