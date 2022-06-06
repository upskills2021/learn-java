package com.learnjava.example.encapsulation.collection.setdemo;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        PhoneBookEntry addr1 = new PhoneBookEntry("Sourav");
        PhoneBookEntry addr2 = new PhoneBookEntry("Prakash");
        PhoneBookEntry addr3 = new PhoneBookEntry(null);
        Set<PhoneBookEntry> entries = new TreeSet<>(Set.of(addr1, addr2, addr3));
        System.out.println(entries);
    }
}
