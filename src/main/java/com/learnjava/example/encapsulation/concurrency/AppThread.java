package com.learnjava.example.encapsulation.concurrency;

import java.io.BufferedReader;
import java.io.FileReader;

public class AppThread extends Thread {
    @Override
    public void run() {
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/resources/hello.txt"))) {
            String line = br.readLine();
            if(line == null) {
                System.out.println("No content");
                return;
            }
            while(line != null) {
                System.out.println(Thread.currentThread().getName() + " Reading the line : " + line);
                line = br.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
