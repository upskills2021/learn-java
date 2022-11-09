package com.learnjava.example.encapsulation.concurrency;

public class AppThreadRunnableDemo {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new AppThreadRunnable());
        Thread thread2 = new Thread(new AppThreadRunnable());
        Thread thread3 = new Thread(new AppThreadRunnable());

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
