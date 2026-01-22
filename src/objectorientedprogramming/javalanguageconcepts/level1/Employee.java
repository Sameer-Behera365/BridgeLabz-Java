package Object_Oriented_Programming.javaLanguageConcepts.level1;

public class Employee {

    static String companyName = "TechCorp";
    static int totalEmployees = 0;

    String name;
    final int id;
    String designation;

    Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    void displayEmployee() {
        System.out.println(name + " " + id + " " + designation);
    }

    public static void main(String[] args) {

        Employee e1 = new Employee("Karthik", 1, "Developer");

        if (e1 instanceof Employee) {
            e1.displayEmployee();
        }

        Employee.displayTotalEmployees();
    }
}
