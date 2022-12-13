package com.learnjava.example.multithreading;

public class Runner2 implements Runnable{
    public void startRunning() {
        for(int i = 0; i<10; ++i) {
            System.out.println("Runner2: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run() {

        startRunning();
    }
}
