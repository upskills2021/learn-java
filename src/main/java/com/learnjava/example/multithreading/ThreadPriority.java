package com.learnjava.example.multithreading;

public class ThreadPriority {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());

        Thread runner1 = new Thread(new Runner1());
        runner1.setPriority(Thread.MAX_PRIORITY);

        Thread runner2 = new Thread(new Runner2());
        runner2.setPriority(Thread.MIN_PRIORITY);

        runner1.start();
        runner2.start();

    }
}
