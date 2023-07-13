package com.courses._04_functional;

import java.util.function.Function;
import java.util.function.Predicate;

public class MathFunctions {

    public static void main(String[] args) {
        Function<Integer, Integer> square = new Function<Integer, Integer>() {

            @Override
            public Integer apply(Integer x) {
                return x * x;
            }
        };

        System.out.println(square.apply(5));

        Function<Integer, Boolean> isOdd = x -> x % 2 == 1;

        Predicate<Integer> isEven = x -> x % 2 == 0;

        isEven.test(4);

        Predicate<Student> isAprroved = student -> student.getQualification() >= 6.0;

        Student juan = new Student(5.0);
        System.out.println(isAprroved.test(juan));
    }

    static class Student {
        private double qualification;

        public Student(double qualification) {
            this.qualification = qualification;
        }

        public double getQualification() {
            return qualification;
        }
    }
}
