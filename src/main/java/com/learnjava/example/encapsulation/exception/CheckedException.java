package com.learnjava.example.encapsulation.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {
    public static void main(String[] args)  {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void readFile() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("");
    }
}
