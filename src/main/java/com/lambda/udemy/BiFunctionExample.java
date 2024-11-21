package com.lambda.udemy;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {

    private static final List<Student> students = StudentDataBase.getAllStudents();
    final static Predicate<Student> p1 = student -> student.getGradeLevel() >= 3;

    static BiFunction<List<Student>, Predicate<Student>, Map<String,Double>> bif
            = (students, studentPredicate) -> {
        Map<String,Double> studentGradeMap = new HashMap<>();
        students.forEach(student -> {
            if (studentPredicate.test(student)){
                studentGradeMap.put(student.getName(), student.getGpa());
            }
        });
        return studentGradeMap;
    };

    public static void main(String[] args) {
        System.out.println(bif.apply(students,p1));
    }
}
