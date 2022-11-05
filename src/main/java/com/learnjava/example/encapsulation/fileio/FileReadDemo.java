package com.learnjava.example.encapsulation.fileio;

import java.io.FileInputStream;
import java.io.IOException;

public class FileReadDemo {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
             fis = new FileInputStream("src/main/resources/hello1.txt");
            int i = 0;
            while((i = fis.read()) != -1) {
                System.out.println((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (fis != null) {
                    fis.close();
               }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
