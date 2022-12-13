package com.learnjava.example.encapsulation.concurrency.project.runnables;

import com.learnjava.example.encapsulation.concurrency.project.bean.User;
import com.learnjava.example.encapsulation.concurrency.project.dao.UserDao;

import java.util.StringTokenizer;
import java.util.concurrent.Callable;

public class UserProcessor implements Callable<Integer> {
    private String userRecord;
    private UserDao userDao;

    public UserProcessor(String userRecord, UserDao userDao) {
        this.userRecord = userRecord;
        this.userDao = userDao;
    }

    @Override
    public Integer call() throws Exception {
        int row = 0;
        System.out.println(Thread.currentThread().getName()+" processing record for : "+userRecord);
        StringTokenizer stringTokenizer = new StringTokenizer(userRecord, ",");
        User user = null;
        while (stringTokenizer.hasMoreTokens()) {
            user = new User();
            user.setId(Integer.parseInt(stringTokenizer.nextToken()));
            user.setName(stringTokenizer.nextToken());
            user.setEmail(stringTokenizer.nextToken());
            row = userDao.saveUser(user);
        }
        return row;
    }
}
