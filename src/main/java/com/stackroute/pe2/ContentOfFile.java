package com.stackroute.pe2;
import java.io.*;
public class ContentOfFile {
    static int contentOfFileTimes(String filename) throws IOException {
        File file = new File("/home/prateema/Documents/unitest2/src/main/java/com/stackroute/practice/FileDemo.txt");
        FileInputStream fileStream = new FileInputStream(file);
        InputStreamReader input = new InputStreamReader(fileStream);
        BufferedReader reader = new BufferedReader(input);
        String line;
        int countWord = 0;
        while ((line = reader.readLine()) != null) {
            if (!(line.equals(""))) {
                String[] wordList = line.split("\\s+");
                countWord += wordList.length;
            }
        }
        return countWord;
    }
}
