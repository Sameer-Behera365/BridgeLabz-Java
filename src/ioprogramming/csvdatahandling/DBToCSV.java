package ioprogramming.csvdatahandling;

import java.sql.*;
import java.io.*;
public class DBToCSV {
    public static void main(String[] args) throws Exception {
        Connection c=DriverManager.getConnection("jdbc:sqlite:test.db");
        Statement st=c.createStatement();
        ResultSet rs=st.executeQuery("select * from employees");
        PrintWriter pw=new PrintWriter("db.csv");
        pw.println("ID,Name,Department,Salary");
        while(rs.next()){
            pw.println(rs.getInt(1)+","+rs.getString(2)+","+rs.getString(3)+","+rs.getInt(4));
        }
        pw.close();
        c.close();
    }
}
