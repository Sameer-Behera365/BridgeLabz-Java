package ioprogramming.csvdatahandling;

import java.io.*;
public class ReadCSVPrint {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("students.csv"));
        br.readLine();
        String l;
        while ((l = br.readLine()) != null) {
            String[] s = l.split(",");
            System.out.println("ID:"+s[0]+" Name:"+s[1]+" Age:"+s[2]+" Marks:"+s[3]);
        }
        br.close();
    }
}