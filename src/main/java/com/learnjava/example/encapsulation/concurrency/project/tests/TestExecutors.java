package com.learnjava.example.encapsulation.concurrency.project.tests;

import com.learnjava.example.encapsulation.concurrency.project.dao.UserDao;
import com.learnjava.example.encapsulation.concurrency.project.runnables.UserProcessor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestExecutors {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        List<String> users = getUsersFromFile();
        UserDao userDao = new UserDao();
        for(String user : users) {
            Future<Integer> future = executorService.submit(new UserProcessor(user, userDao));
            System.out.println(future.get());
        }
        executorService.shutdown();
        System.out.println("Main Execution is over!!");
    }

    private static List<String> getUsersFromFile() {
        List<String> users = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/users.txt"))) {
           String line;
            while ((line = reader.readLine()) != null) {
                users.add(line);
            }
        } catch (IOException e) {
            Logger.getLogger(TestExecutors.class.getName()).log(Level.SEVERE, null, e);
        }
        return users;
    }
}
