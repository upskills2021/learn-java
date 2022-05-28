package com.learnjava.example.encapsulation.interface_demo;

import java.util.ArrayList;
import java.util.List;

public class UserDAOImpl implements UserDAO{
    private List<User> users = new ArrayList<>();
    @Override
    public void create(User user) {
        //implement logic to save user to db
        users.add(user);
        System.out.println("User successfully created..");
    }

    @Override
    public User findById(Long userId) {
      return users.stream()
              .filter(u -> u.getUserId() == userId)
              .findFirst()
              .orElse(null);
    }
}
