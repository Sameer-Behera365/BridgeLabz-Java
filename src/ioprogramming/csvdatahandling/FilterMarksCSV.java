package ioprogramming.csvdatahandling;

import java.nio.file.*;
public class FilterMarksCSV {
    public static void main(String[] args) throws Exception {
        Files.lines(Paths.get("students.csv")).skip(1)
                .filter(x -> Integer.parseInt(x.split(",")[3]) > 80)
                .forEach(System.out::println);
    }
}
