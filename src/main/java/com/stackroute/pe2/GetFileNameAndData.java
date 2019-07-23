package com.stackroute.pe2;

import java.io.File;
import java.io.*;
    public class GetFileNameAndData{
        String contentPrintTextFile(String filename) throws IOException {
            File f;
            FileInputStream fis = null;
            String out = "";
            byte[] b = null;

            try {
                f = new File("../src/main/java/com/stackroute/practice/file.txt");
            } catch (Exception e) {
                System.out.println(e);
                return null;
            }

            try {
                fis = new FileInputStream(f);
                b = new byte[(int) f.length()];
                fis.read(b);
            } catch (Exception e) {
                System.out.println(e);
            }

            out = new String(b);
            System.out.println(out);

            return out.toUpperCase();
        }

    }

