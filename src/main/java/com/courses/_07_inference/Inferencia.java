package com.courses._07_inference;

import java.util.List;
import java.util.function.Function;

import com.courses._06_reference_operator.NombresUtils;

public class Inferencia {
    public static void main(String[] args) {
        Function<Integer, String> funcionConvertidora = x -> "Al doble = " + (x * 2);

        List<String> alumnos = NombresUtils.getList("Juan", "Hugo", "Paco", "Luis");

        alumnos.forEach((String alumno) -> System.out.println(alumno));
        System.out.println("////////////////");
        alumnos.forEach(System.out::println);
    }
}
