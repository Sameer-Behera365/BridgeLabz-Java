package ioprogramming.csvdatahandling;

import java.nio.file.*;
import java.util.*;
public class UpdateITSalaryCSV {
    public static void main(String[] args) throws Exception {
        List<String> out = new ArrayList<>();
        List<String> in = Files.readAllLines(Paths.get("employees.csv"));
        out.add(in.get(0));
        for(int i=1;i<in.size();i++){
            String[] a=in.get(i).split(",");
            if(a[2].equals("IT")){
                a[3]=String.valueOf((int)(Integer.parseInt(a[3])*1.1));
            }
            out.add(String.join(",",a));
        }
        Files.write(Paths.get("employees_updated.csv"), out);
    }
}