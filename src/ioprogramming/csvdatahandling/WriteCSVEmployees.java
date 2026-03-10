package ioprogramming.csvdatahandling;

import java.io.*;
public class WriteCSVEmployees {
    public static void main(String[] args) throws Exception {
        PrintWriter pw = new PrintWriter("employees.csv");
        pw.println("ID,Name,Department,Salary");
        pw.println("1,Karthik,IT,50000");
        pw.println("2,Arun,HR,45000");
        pw.println("3,Meena,IT,60000");
        pw.println("4,Ravi,Sales,55000");
        pw.println("5,Divya,IT,70000");
        pw.close();
    }
}
