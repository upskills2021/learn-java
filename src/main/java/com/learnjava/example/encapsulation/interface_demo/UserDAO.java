package com.learnjava.example.encapsulation.interface_demo;

public interface UserDAO {
    void create(User user);
    User findById(Long userId);
}
