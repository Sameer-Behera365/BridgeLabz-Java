package Object_Oriented_Programming.JavaConstructors.level1;

public class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class Manager extends Employee {
    void display() {
        System.out.println(employeeID + " " + department);
    }
}
