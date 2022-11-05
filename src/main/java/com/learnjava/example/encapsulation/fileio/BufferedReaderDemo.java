package com.learnjava.example.encapsulation.fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("src/main/resources/hello.txt"));
            String line = br.readLine();
            if(line == null) {
                System.out.println("No content");
                return;
            }
            while(line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
