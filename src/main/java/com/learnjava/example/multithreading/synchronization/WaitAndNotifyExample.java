package com.learnjava.example.multithreading.synchronization;

/**
 * Let's assume we have 2 threads, they are running independently because they are distinct threads.
 * so If we have the situation that Thread1 calls wait(): Thread1 is going to be in a waiting state
 * which means lock is going to be released. The second thread can acquire the intrinsic lock which means
 * it can execute the synchronized block or synchronized method. When second thread calls notify(), the first
 * thread that is in waiting state can continue with the operation. This is we can release or reacquire the
 * intrinsic lock with the have of wait() and notify().
 */
public class WaitAndNotifyExample {

    public void produce() throws InterruptedException{
        synchronized (this) {
            System.out.println("Running the produce method...");
            wait();
            System.out.println("Again in the producer method...");
        }
    }
    public void consume() throws InterruptedException {
        Thread.sleep(1000);
        synchronized (this) {
            System.out.println("Consume method is executed...");
            notify();
            Thread.sleep(1000);
        }
    }

    public static void main(String[] args) {
        WaitAndNotifyExample waitAndNotifyExample = new WaitAndNotifyExample();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    waitAndNotifyExample.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    waitAndNotifyExample.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();
    }
}
