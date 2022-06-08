package com.learnjava.example.encapsulation.collection.mapdemo;

import java.util.HashMap;
import java.util.Map;

public class NestedMap {
    public static void main(String[] args) {
        Map<Integer, User> userProfile = new HashMap<>();
        User user1 = new User();
        user1.setName("Sourav");
        user1.setAge(30);
        user1.setCity("Kolkata");

        User user2 = new User();
        user2.setName("Sandipan");
        user2.setAge(30);
        user2.setCity("Kolkata");
        userProfile.put(1, user1);
        userProfile.put(2, user2);
        System.out.println("UserProfile :: " + userProfile);
    }
}
