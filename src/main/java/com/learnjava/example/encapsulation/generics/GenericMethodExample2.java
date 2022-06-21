package com.learnjava.example.encapsulation.generics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericMethodExample2 {
    public static <C, I> Map<C, List<I>> createItemMap(C code, List<I> items) {
        Map<C, List<I>> itemMap = new HashMap<>();
        itemMap.put(code, items);
        return itemMap;
    }

    public static <K, V> void printItemMap(Map<K, V> map) {
        map.forEach((key, value) -> System.out.println("Code :: " + key + " || items :: " + value));
    }

    public static void main(String[] args) {
        Map<String, List<Integer>> itemMap1 = createItemMap("cat1", List.of(1, 2));
        printItemMap(itemMap1);
    }
}
