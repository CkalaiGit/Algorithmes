package com.lambda.udemy;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

    final static Predicate<Student> p1 = student -> student.getGradeLevel() >= 3;
    final static Predicate<Student> p2 = student -> student.getGpa() >= 3.9;
    final static BiPredicate<Integer, Double> bip = (gradeLevel, gpa) -> gradeLevel >= 3 && gpa >= 3.9;
    final static BiConsumer<String, List<String>> bic = (name, activities) -> {
        System.out.println("name : " + name + " activities :" + activities);
    };

    final static Consumer<Student> c1 = student -> {
        if (bip.test(student.getGradeLevel(), student.getGpa())) {
            bic.accept(student.getName(), student.getActivities());
        }
    };

    private static final List<Student> students = StudentDataBase.getAllStudents();

    public static void main(String[] args) {
        students.forEach(c1);
    }
}
