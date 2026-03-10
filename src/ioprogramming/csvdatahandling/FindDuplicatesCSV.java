package ioprogramming.csvdatahandling;

import java.nio.file.*;
import java.util.*;
public class FindDuplicatesCSV {
    public static void main(String[] args) throws Exception {
        Set<String> s=new HashSet<>();
        Files.lines(Paths.get("students.csv")).skip(1)
                .forEach(l->{
                    String id=l.split(",")[0];
                    if(!s.add(id)) System.out.println("Duplicate: "+l);
                });
    }
}
