package com.learnjava.example.encapsulation.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {
    public static void main(String[] args) throws FileNotFoundException{
        readFile();
    }

    private static void readFile() throws FileNotFoundException {
            FileInputStream fis = new FileInputStream("");
    }
}
