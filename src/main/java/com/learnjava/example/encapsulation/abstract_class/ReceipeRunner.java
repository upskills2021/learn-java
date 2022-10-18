package com.learnjava.example.encapsulation.abstract_class;

import java.util.Arrays;
import java.util.List;

public class ReceipeRunner {
    public static void main(String[] args) {
        Receipe receipe1 = new Receipe1();
        receipe1.execute();

        Receipe receipe2 = new Receipe2();
        receipe2.execute();

        List<Receipe> receipes = Arrays.asList(new Receipe1(), new Receipe2());
        prepareReceipe(receipes);
    }

    private static void prepareReceipe(List<Receipe> receipes) {
        for (Receipe receipe : receipes) {
            receipe.execute();
        }
    }
}
