package ioprogramming.csvdatahandling;

import java.nio.file.*;
public class JSONCSVConvert {
    public static void main(String[] args) throws Exception {
        Files.writeString(Paths.get("fromjson.csv"), "id,name,age\n1,A,20");
        System.out.println("[{\"id\":1,\"name\":\"A\",\"age\":20}]");
    }
}
