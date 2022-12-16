package com.learnjava.example.multithreading.memorymanagement;

/**
 * with the have of synchronized keyword, we have to make sure that this method is executed
 * by single thread at a given time
 * Thread Safe : its synchronized
 * @throws InterruptedException
 */
public class SynchronizationExample1 {
    private static int counter = 0;

    private static synchronized void incrementCounter() {
        // 1. read number from memory
        // 2. increment the value
        // 3. write the number into the memory
        // 4. return with the variable
        counter++; // t1 - 1, t2 - 0
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private static void process() {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<100; ++i) {
                    incrementCounter();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<100; ++i) {
                    incrementCounter();
                }
            }
        });
        t1.start();
        t2.start();
        try {
            /**
             * java.lang.Thread class provides the join() method which allows one thread to wait until another thread completes its execution.
             * If t is a Thread object whose thread is currently executing, then t.join() will make sure that t is terminated
             * before the next instruction is executed by the program.
             */
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("The value of Counter :: " + counter);
    }

    public static void main(String[] args) {
        for (int i=0; i<100; ++i) {
            process();
            counter = 0;
        }

    }
}
