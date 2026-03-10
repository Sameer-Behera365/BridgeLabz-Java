package ioprogramming.csvdatahandling;

import java.nio.file.*;
public class CountCSVRows {
    public static void main(String[] args) throws Exception {
        long c = Files.lines(Paths.get("students.csv")).skip(1).count();
        System.out.println(c);
    }
}