package ioprogramming.csvdatahandling;

import java.util.Base64;
public class EncryptCSV {
    static String enc(String x){return Base64.getEncoder().encodeToString(x.getBytes());}
    static String dec(String x){return new String(Base64.getDecoder().decode(x));}
    public static void main(String[] args){
        String s="50000";
        String e=enc(s);
        System.out.println(e);
        System.out.println(dec(e));
    }
}
