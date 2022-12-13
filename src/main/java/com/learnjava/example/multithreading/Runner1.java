package com.learnjava.example.multithreading;

public class Runner1 implements Runnable{
    @Override
    public void run() {
        startRunning();
    }
    public void startRunning() {
        for(int i = 0; i<10; ++i) {
            System.out.println("Runner1: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
