package com.learnjava.example.encapsulation.concurrency;

public class AppThreadDemo {
    public static void main(String[] args) {
        AppThread appThread1 = new AppThread(); // NEW
        AppThread appThread2 = new AppThread();
        AppThread appThread3 = new AppThread();

        appThread1.start(); // RUNNABLE
        appThread2.start();
        appThread3.start();



        //RUNNING
        //DEAD or TERMINATED
        //WAITING STATE

    }
}
