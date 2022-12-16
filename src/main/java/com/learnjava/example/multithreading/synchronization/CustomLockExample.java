package com.learnjava.example.multithreading.synchronization;

public class CustomLockExample {
    public static int counter1 = 0;
    public static int counter2 = 0;

    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    /**
     * First thread is going to lock on the first object
     * second thread is going to lock on the second object
     * which means they are not using same intrinsic lock of the object of the class.
     * They are going to execute these methods independently - First thread is going to execute increment1()
     * It does not have to wait for second thread finishes increment2() and vise versa.
     * This is why it's extremely convenient to use final Object for different locks.
     * This way we can make sure that independent methods can be executed by independent threads at the same time.
     */
    public static void increment1() {
        // at the same time != parallel execution - means CPU can use time slicing algo for both of the thread
        synchronized (lock1) {
            counter1++;
        }
    }

    public static void increment2() {
        synchronized (lock2) {
            counter2++;
        }
    }

    public static void process() {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; ++i) {
                    increment1();
                }

            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; ++i) {
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
        System.out.println("Counter1 is :: " + counter1);
        System.out.println("Counter2 is :: " + counter2);
    }

}
