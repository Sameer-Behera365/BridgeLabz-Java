package ioprogramming.csvdatahandling;

import java.nio.file.*;
import java.util.regex.*;
public class ValidateCSV {
    public static void main(String[] args) throws Exception {
        Pattern email = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
        Files.lines(Paths.get("contacts.csv")).skip(1)
                .forEach(l->{
                    String[] a=l.split(",");
                    if(!email.matcher(a[2]).matches() || !a[3].matches("\\d{10}"))
                        System.out.println("Invalid: "+l);
                });
    }
}