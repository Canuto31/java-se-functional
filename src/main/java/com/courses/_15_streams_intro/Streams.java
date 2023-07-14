package com.courses._15_streams_intro;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import com.courses._06_reference_operator.NombresUtils;

public class Streams {
    public static void main(String[] args) {
        List<String> courseList = NombresUtils.getList("Java", "Phyton", "C++");

        for (String course : courseList) {
            System.out.println("Platzi - " + course);
        }

        Stream<String> coursesStream = Stream.of("Java", "Phyton", "C++") ;

        // Stream<Integer> courseLengthStream = coursesStream.map(course -> course.length());

        // Optional<Integer> longest = courseLengthStream.max((x, y) -> y - x);

        Stream<String> emphasisCoursesStream = coursesStream.map(course -> course + "!");

        // emphasisCoursesStream.forEach(System.out::println);

        Stream<String> justJavaCourses = emphasisCoursesStream.filter(course -> course.toLowerCase().contains("java"));

        justJavaCourses.forEach(System.out::println);
    }
}
