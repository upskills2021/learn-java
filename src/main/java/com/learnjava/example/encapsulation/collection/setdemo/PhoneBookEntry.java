package com.learnjava.example.encapsulation.collection.setdemo;

import com.learnjava.example.encapsulation.collection.sorting.Comparing;

import java.util.Objects;

public class PhoneBookEntry implements Comparable<PhoneBookEntry>{
    private String name;

    public PhoneBookEntry(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PhoneBookEntry)) return false;
        PhoneBookEntry that = (PhoneBookEntry) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "PhoneBookEntry{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(PhoneBookEntry o) {
        return Comparing.stringCompareTo(this.name, o.name);
    }
}
