package com.learnjava.example.encapsulation.generics;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class GenericMethodExample {
    public static <T> void printItem(T t) {
        System.out.println(t.toString());
    }

    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setProductId(1l);
        product1.setProductName("P1");
        product1.setCode("p01");
        product1.setPrice(BigDecimal.valueOf(1000));
        printItem(product1);

        Product product2 = new Product();
        product2.setProductId(2l);
        product2.setProductName("P2");
        product2.setCode("p02");
        product2.setPrice(BigDecimal.valueOf(2000));
        printItem(product2);
        List<Product> products = Arrays.asList(product1, product2);
        printItem(products);
    }
}
