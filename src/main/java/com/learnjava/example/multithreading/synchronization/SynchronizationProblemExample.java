package com.learnjava.example.multithreading.synchronization;

public class SynchronizationProblemExample {
    public static int counter = 0;

    /**
     * with the have of synchronized keyword, we have to make sure that this method is executed
     * by single thread at a given time
     * @throws InterruptedException
     */
    public static synchronized void increment() throws InterruptedException {
        counter++;
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
                        increment();
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
                        increment();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        });
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<100; ++i) {
                    try {
                        increment();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<100; ++i) {
                    try {
                        increment();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        Thread t5 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<100; ++i) {
                    try {
                        increment();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Counter is :: " + counter);
    }

    public static void main(String[] args) {
            process();
            if(counter != 500) {
                System.out.println("ALERT");
            }

    }
}
