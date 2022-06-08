package com.learnjava.example.encapsulation.collection.mapdemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>(); // immutable key -> String Immutable class
        map1.put("John", 25);
        map1.put("Raj", 29);
        map1.put("Anita", null);
        System.out.println(map1);
        map1.put("Anita", 23);
        System.out.println(map1);
        System.out.println("Contains John? " + map1.containsKey("John"));
        System.out.println("John's age: " + map1.get("John"));
        System.out.println("Iterating using keySet ...");
        Set<String> names = map1.keySet();
        for(String name: names) {
            System.out.println("Name: " + name + ", Age: " + map1.get(name));
        }

        System.out.println("Iterating using entrySet ...");
        Set<Map.Entry<String, Integer>> mappings = map1.entrySet();
        for (Map.Entry<String, Integer> mapping : mappings) {
            System.out.println("Name: " + mapping.getKey() + ", Age: " + mapping.getValue());
        }
        names.remove("Anita");
        System.out.println(map1);
    }
}
