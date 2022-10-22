package com.learnjava.example.encapsulation.collection.setdemo;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("D");
        hashSet.add("B");
        hashSet.add("A");
        hashSet.add("C");
       for(String s: hashSet) {
           System.out.println(s);
       }
       // immutableSet.add("E");
        executeHashSet(hashSet);
        executeLinkedHashSet(hashSet);
        executeTreeSet(hashSet);
    }
    // In hashset elements are not stored in insertion order as well as sorted order
    private static void executeHashSet(Set<String> hashSet) {
        System.out.println(hashSet);
        hashSet.add("F");
        hashSet.add("E");
        System.out.println(hashSet);
    }
    // In LinkedHashset elements are not stored in insertion order
    private static void executeLinkedHashSet(Set<String> immutableSet) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(immutableSet);
        linkedHashSet.add("E");
        System.out.println(linkedHashSet);
    }
    // TreeSet maintains sorted order , it implements NavigableSet
    private static void executeTreeSet(Set<String> immutableSet) {
        TreeSet<String> treeSet = new TreeSet<>(immutableSet);
        treeSet.add("E");
        System.out.println(treeSet);
    }


}
