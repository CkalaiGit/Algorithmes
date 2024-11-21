package com.lambda.udemy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionExample {

    static Function<String, String> function = String::toUpperCase;
    static Function<String, String> addString = name -> name.concat(" zip");

    static Function<List<Student>, Map<String, Double>> studentFunction =  students -> {
        Map<String, Double> studentGradMap = new HashMap<>();
        students.forEach(student -> studentGradMap.put(student.getName(), student.getGpa()));
        return studentGradMap;
    };

    private static final List<Student> students = StudentDataBase.getAllStudents();

    public static void main(String[] args) {
        System.out.println(function.andThen(addString).apply("java 8"));
        System.out.println(function.compose(addString).apply("java 8"));
        System.out.println(studentFunction.apply(students));
    }
}
