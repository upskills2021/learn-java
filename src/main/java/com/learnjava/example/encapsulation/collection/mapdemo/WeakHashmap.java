package com.learnjava.example.encapsulation.collection.mapdemo;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashmap {
    public static void main(String[] args) throws InterruptedException {
        Map<User, String> map = new WeakHashMap<>();
        User u = new User();
        u.setName("User1");
        u.setAge(30);
        u.setCity("Kolkata");
        map.put(u, "User1");
        System.out.println(map);
        u = null;
        System.gc();
        Thread.sleep(5000);
        System.out.println(map);
    }
}
