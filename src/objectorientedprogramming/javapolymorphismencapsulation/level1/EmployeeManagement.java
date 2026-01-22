package objectorientedprogramming.javapolymorphismencapsulation.level1;

abstract class Employee {
    private int employeeId;
    private String name;
    protected double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println(employeeId + " " + name + " Salary: " + calculateSalary());
    }
}

interface Department {
    void assignDepartment(String dept);
    String getDepartmentDetails();
}

class FullTimeEmployee extends Employee implements Department {
    private String department;

    public FullTimeEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }

    public double calculateSalary() {
        return baseSalary;
    }

    public void assignDepartment(String dept) {
        department = dept;
    }

    public String getDepartmentDetails() {
        return department;
    }
}

class PartTimeEmployee extends Employee {
    private int hours;

    public PartTimeEmployee(int id, String name, double rate, int hours) {
        super(id, name, rate);
        this.hours = hours;
    }

    public double calculateSalary() {
        return baseSalary * hours;
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee(1, "Karthik", 30000);
        Employee e2 = new PartTimeEmployee(2, "Arun", 200, 40);

        e1.displayDetails();
        e2.displayDetails();
    }
}
