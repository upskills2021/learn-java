package com.learnjava.example.multithreading;


public class SingleThreadedApplicationExample {
    public static void main(String[] args) {
        Runner1 runner1 = new Runner1();
        Runner2 runner2 = new Runner2();
        runner1.startRunning();
        runner2.startRunning();
        System.out.println("Main Thread is running!");
    }
}
