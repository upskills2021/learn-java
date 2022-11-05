package com.learnjava.example.encapsulation.fileio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteDemo {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("src/main/resources/hello.txt", true);
            fos.write("Write into File".getBytes());
            fos.write("\nWrite into File".getBytes());
            System.out.println("Content has been written successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
