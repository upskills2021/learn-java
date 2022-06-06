package com.learnjava.example.encapsulation.collection.setdemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        Set<String> immutableSet = Set.of("A","B","C","D");
        System.out.println(immutableSet);
       // immutableSet.add("E");
        executeHashSet(immutableSet);
        executeLinkedHashSet(immutableSet);
        executeTreeSet(immutableSet);
    }
    // In hashset elements are not stored in insertion order as well as sorted order
    private static void executeHashSet(Set<String> immutableSet) {
        Set<String> hashSet = new HashSet<>(immutableSet);
        System.out.println(hashSet);
        hashSet.add("D");
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
