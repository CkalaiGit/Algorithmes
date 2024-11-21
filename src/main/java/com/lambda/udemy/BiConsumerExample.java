package com.lambda.udemy;

import java.util.function.BiConsumer;

public class BiConsumerExample {

    static BiConsumer<String, String> biConsumer = (a, b) -> {
        System.out.println("a : " + a + " - b : " + b);
    };

    static BiConsumer<Integer, Integer> multiply = (a, b) -> {
        System.out.println(a*b);
    };

    static BiConsumer<Integer, Integer> division = (a, b) -> {
        System.out.println(a/b);
    };

    public static void main(String[] args) {
        biConsumer.accept("Java 8 ", "Java 17 ");
        multiply.andThen(division).accept(5, 5);
    }
}
