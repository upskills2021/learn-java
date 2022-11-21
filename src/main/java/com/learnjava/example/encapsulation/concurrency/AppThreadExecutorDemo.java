package com.learnjava.example.encapsulation.concurrency;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class AppThreadExecutorDemo {
    public static void main(String[] args) {
        Executor executor = Executors.newSingleThreadExecutor();
        executor.execute(new AppThreadRunnable());
    }
}
