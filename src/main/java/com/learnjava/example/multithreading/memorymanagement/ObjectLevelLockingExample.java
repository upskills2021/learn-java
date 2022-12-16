package com.learnjava.example.multithreading.memorymanagement;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

public class ObjectLevelLockingExample {
    private void syncMethod(String msg) {
        synchronized (this) {
            System.out.println("in the sync method " + msg + " " + LocalDateTime.now());
            try {
                TimeUnit.SECONDS.sleep(5);
                System.out.println(msg + " has finished syncMethod...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ObjectLevelLockingExample obj = new ObjectLevelLockingExample();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread1 before call " + LocalDateTime.now());
                obj.syncMethod("from thread1");
                System.out.println("thread1 after call " + LocalDateTime.now());
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread2 before call " + LocalDateTime.now());
                obj.syncMethod("from thread2");
                System.out.println("thread2 after call " + LocalDateTime.now());
            }
        });

        t1.start();
        t2.start();
    }
}
