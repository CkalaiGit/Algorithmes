package com.lambda.udemy;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    static Consumer<String> c1 = (str) -> System.out.println(str.toUpperCase());
    static Consumer<Student> c2 = System.out::println;
    static Consumer<Student> c3 = student -> System.out.println(student.getName());
    static Consumer<Student> c4 = student -> System.out.println(student.getActivities());


    private static final List<Student> students = StudentDataBase.getAllStudents();

    public static void main(String[] args) {
        printName();
    }

    public static void printName() {
        students.forEach(c3.andThen(c4));
    }


}
