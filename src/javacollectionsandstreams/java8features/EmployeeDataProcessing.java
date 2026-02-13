package javacollectionsandstreams.java8features;

import java.util.*;
import java.util.stream.*;

class Employee {
    int id; String name; String dept; double salary;
    Employee(int i,String n,String d,double s){id=i;name=n;dept=d;salary=s;}
    String getDept(){return dept;}
    double getSalary(){return salary;}
}

public class EmployeeDataProcessing {
    public static void main(String[] args) {
        List<Employee> list = List.of(
                new Employee(1,"A","Engineering",90000),
                new Employee(2,"B","Engineering",85000),
                new Employee(3,"C","HR",60000)
        );

        Map<String,Double> avg =
                list.stream()
                        .filter(e->e.dept.equals("Engineering") && e.salary>80000)
                        .sorted(Comparator.comparing(Employee::getSalary).reversed())
                        .collect(Collectors.groupingBy(
                                Employee::getDept,
                                Collectors.averagingDouble(Employee::getSalary)
                        ));

        System.out.println(avg);
    }
}