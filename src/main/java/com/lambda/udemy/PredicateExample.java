package com.lambda.udemy;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

    final static Predicate<Integer> isEven = integer -> (integer % 2 == 0);
    final static Predicate<Integer> isOdd = integer -> (integer % 2 != 0);
    final static Predicate<Student> p1 = student -> student.getGradeLevel() >= 3;
    final static Predicate<Student> p2 = student -> student.getGpa() >= 3.9;

    private static final List<Student> students = StudentDataBase.getAllStudents();

    public static void main(String[] args) {

        students.forEach((student) -> {
            if (p1.and(p2).test(student)) System.out.println(student);
        });
    }
}
