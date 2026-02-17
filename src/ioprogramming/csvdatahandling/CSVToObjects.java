package ioprogramming.csvdatahandling;

import java.nio.file.*;
import java.util.*;

class Student {
    int id,age,marks;
    String name;
    Student(int i,String n,int a,int m){id=i;name=n;age=a;marks=m;}
    public String toString(){return id+" "+name+" "+age+" "+marks;}
}

public class CSVToObjects {
    public static void main(String[] args) throws Exception {
        List<Student> list = Files.lines(Paths.get("students.csv")).skip(1)
                .map(x->x.split(","))
                .map(a->new Student(Integer.parseInt(a[0]),a[1],
                        Integer.parseInt(a[2]),Integer.parseInt(a[3])))
                .toList();
        list.forEach(System.out::println);
    }
}