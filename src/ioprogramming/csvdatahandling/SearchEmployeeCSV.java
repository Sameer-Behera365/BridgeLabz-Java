package ioprogramming.csvdatahandling;

import java.nio.file.*;
public class SearchEmployeeCSV {
    public static void main(String[] args) throws Exception {
        String name = "Karthik";
        Files.lines(Paths.get("employees.csv")).skip(1)
                .map(x -> x.split(","))
                .filter(a -> a[1].equalsIgnoreCase(name))
                .forEach(a -> System.out.println(a[2]+" "+a[3]));
    }
}