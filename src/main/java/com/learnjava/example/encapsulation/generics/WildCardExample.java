package com.learnjava.example.encapsulation.generics;

import java.util.ArrayList;
import java.util.List;

public class WildCardExample {

  // UpperBounded Wildcard -> List<? extends Number>
  private static void printItems(List<? extends Number> items) {
    for (Number item : items) {
      System.out.println(item);
    }
  }

  // Lower Bounded wildcard -> List<? super Number>
  private static <T extends Integer> void addItem(List<? super Number> items, T item) {
    items.add(item);
    System.out.println("Item added successfully");
//     for (Number o : items) {
//       System.out.println(o);
//     }
  }

  public static void main(String[] args) {
    List<Number> numbers = new ArrayList<>(List.of(1, 2));
    addItem(numbers, 3);
    printItems(numbers);
  }
}
