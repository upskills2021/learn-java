package com.learnjava.example.multithreading.memorymanagement;

/**
 * - With the have of synchronized keyword, we have to make sure that this method is executed
 *   by single thread at a given time
 * - Because This class object  has single lock: this is why the methods can not
 *   be executed "at the same time" - under the hood time slicing alrorithm is going to handle
 *   both of the threads.
 * - Every object has a single monitor lock.
 * - This is class level locking because we are dealing with static method or static variables.
 * - Usually its not good practice to use synchronized keyword
 * - Rule of thumb: we synchronize blocks that are 100% necessary
 */
public class SynchronizationProblemExample {
    private static int counter1 = 0;
    private static int counter2 = 0;

    private static synchronized void increment1() {
        counter1++;
        System.out.println(Thread.currentThread().getName() + " -> counter1="+counter1);
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private static synchronized void increment2() {
        counter2++;
        System.out.println(Thread.currentThread().getName() + " -> counter2="+counter2);
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private static void process() {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i<100; ++i) {
                    increment1();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i<100; ++i) {
                    increment2();
                }
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Value of counter1 :: " + counter1);
        System.out.println("Value of counter1 :: " + counter2);
    }

    public static void main(String[] args) {
        process();
    }
}
