package ioprogramming.csvdatahandling;

import java.nio.file.*;
public class Top5SalaryCSV {
    public static void main(String[] args) throws Exception {
        Files.lines(Paths.get("employees.csv")).skip(1)
                .sorted((a,b)->Integer.parseInt(b.split(",")[3])-
                        Integer.parseInt(a.split(",")[3]))
                .limit(5)
                .forEach(System.out::println);
    }
}