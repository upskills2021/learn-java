package com.learnjava.example.encapsulation.fileio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class BufferedWriterDemo {
    public static void main(String[] args) {
        try {
            List<String> dataList = Arrays.asList("Hello", "world", "awesome");
            BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/resources/hello.txt", true));
            for(String data: dataList) {
                writer.write(data);
                writer.newLine();
            }
           writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
