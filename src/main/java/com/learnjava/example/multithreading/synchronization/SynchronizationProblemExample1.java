package com.learnjava.example.multithreading.synchronization;

public class SynchronizationProblemExample1 {
    public static int counter1 = 0;
    public static int counter2 = 0;
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
    public static synchronized void increment1() throws InterruptedException {
        counter1++;
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static synchronized void increment2() throws InterruptedException {
        counter2++;
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void process() {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<100; ++i) {
                    try {
                        increment1();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<100; ++i) {
                    try {
                        increment2();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
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

        System.out.println("Counter1 is :: " + counter1);
        System.out.println("Counter2 is :: " + counter2);
    }

    public static void main(String[] args) {
            process();
            if(counter1 != 500) {
                System.out.println("ALERT");
            }

    }
}
