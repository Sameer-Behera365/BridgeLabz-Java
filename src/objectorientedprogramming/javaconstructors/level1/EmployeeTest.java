package Object_Oriented_Programming.JavaConstructors.level1;

public class EmployeeTest {
    public static void main(String[] args) {

        Manager m = new Manager();   // subclass object

        m.employeeID = 101;
        m.department = "IT";

        m.setSalary(50000);

        m.display();
    }
}
