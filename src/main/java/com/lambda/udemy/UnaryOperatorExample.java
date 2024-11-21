package com.lambda.udemy;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    static UnaryOperator<String> unaryOperator = String::toUpperCase;

    public static void main(String[] args) {
        System.out.println(unaryOperator.apply("java 8"));
    }
}
