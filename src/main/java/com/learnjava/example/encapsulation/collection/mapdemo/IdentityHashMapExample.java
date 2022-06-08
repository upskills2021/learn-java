package com.learnjava.example.encapsulation.collection.mapdemo;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapExample {
    public static void main(String[] args) {
        Integer id1 = new Integer(1);
        Integer id2 = new Integer(1);
        System.out.println(id1.equals(id2));
        System.out.println(id1 == id2);
        Map<Integer, String> map = new IdentityHashMap<>();
        map.put(id1, "id1");
        map.put(id2, "id2");
        System.out.println(map);
    }
}
