package com.stackroute.pe2;
import java.io.*;
public class PrintFileDataWithArray {
    byte[] byteFileContent(String Filename) throws IOException {


        File file = new File("..src/main/java/com/stackroute/practice/file.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));
        String s="";
        String st;
        while ((st = br.readLine()) != null)
        {
            s+=st;
        }
        byte[] bytearr1= s.getBytes();

        return bytearr1;
    }
}
