package com.learnjava.example.encapsulation.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TypeInferenceExample {

  public static <T extends Comparable<T>> T findMinItem(List<T> items) {
    Optional<T> optionalItem = items
        .stream()
        .reduce((a, b) -> a.compareTo(b) < 0 ? a : b);
    optionalItem.orElseThrow(() -> new IllegalArgumentException("Item not found"));
    return optionalItem.get();
  }

  public static void main(String[] args) {
    //Compiler looks at method invocation and determine type of argument T -> Type inference
    Integer minItem = findMinItem(List.of(1, 2));
    List<String> list = new ArrayList();
    list.add("B");
    list.add("A");
    TypeInferenceExample.<String>findMinItem(list); // type witness, its not needed
    String minItem1 = TypeInferenceExample.findMinItem(list);
    System.out.println(minItem1);
  }
}
