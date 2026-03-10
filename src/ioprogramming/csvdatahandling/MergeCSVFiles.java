package ioprogramming.csvdatahandling;

import java.nio.file.*;
import java.util.*;
import java.io.*;
public class MergeCSVFiles {
    public static void main(String[] args) throws Exception {
        Map<String,String[]> m=new HashMap<>();
        Files.lines(Paths.get("students1.csv")).skip(1)
                .forEach(l->{String[] a=l.split(","); m.put(a[0],a);});
        PrintWriter pw=new PrintWriter("merged.csv");
        pw.println("ID,Name,Age,Marks,Grade");
        Files.lines(Paths.get("students2.csv")).skip(1)
                .forEach(l->{
                    String[] b=l.split(",");
                    String[] a=m.get(b[0]);
                    pw.println(a[0]+","+a[1]+","+a[2]+","+b[1]+","+b[2]);
                });
        pw.close();
    }
}