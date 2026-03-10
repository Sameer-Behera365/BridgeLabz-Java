package ioprogramming.csvdatahandling;

import java.io.*;
public class ReadLargeCSV {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new FileReader("big.csv"));
        br.readLine();
        int c=0; String l;
        while((l=br.readLine())!=null){
            c++;
            if(c%100==0) System.out.println("Processed "+c);
        }
        br.close();
    }
}