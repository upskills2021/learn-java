package com.learnjava.example.encapsulation.generics;

import java.util.List;
import java.util.Optional;

public class BoundedType<T extends Comparable<T>> {
    private List<T> items;
    public BoundedType(List<T> items) {
        this.items = items;
    }
    public Optional<T> findMinItem() {
        return items.stream().reduce((a,b) -> a.compareTo(b) < 0 ? a : b);
    }
    public Optional<T> findMaxItem() {
        return items.stream().reduce((a,b) -> a.compareTo(b) > 0 ? a : b);
    }
}
