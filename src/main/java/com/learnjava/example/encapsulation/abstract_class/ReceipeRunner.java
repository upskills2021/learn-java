package com.learnjava.example.encapsulation.abstract_class;

import java.util.Arrays;
import java.util.List;

public class ReceipeRunner {
    public static void main(String[] args) {
        List<Receipe> receipes = Arrays.asList(new Receipe1(), new Receipe2());
        prepareReceipe(receipes);
    }

    private static void prepareReceipe(List<Receipe> receipes) {
        receipes.stream().forEach( receipe -> receipe.execute());
    }
}
