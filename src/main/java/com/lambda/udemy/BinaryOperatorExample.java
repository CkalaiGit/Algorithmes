package com.lambda.udemy;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    static BinaryOperator<Integer> binaryOperator = (a,b) -> a * b;
    public static void main(String[] args) {
        System.out.println(binaryOperator.apply(3,4));
    }
}
