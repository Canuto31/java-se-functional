package com.courses._08_lambda;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import com.courses._06_reference_operator.NombresUtils;

public class Sintaxis {
    public static void main(String[] args) {
        List<String> cursos = NombresUtils.getList("Java", "Functional");

        cursos.forEach(curso -> System.out.println(curso));

        usarZero(() -> 2);
        usarPredicado((text) -> text.isEmpty());
        usarBifunction((x, y) -> x * y);
        usarBifunction((x, y) -> {
            System.out.println("x= " + x + " y= " + y);
            return x * y;
        });
        usarNada(() -> {});
    }

    static void usarZero (ZeroArgumentos zeroArgumentos) { 

    }

    static void usarPredicado (Predicate<String> predicate) { 

    }

    static void usarBifunction (BiFunction<Integer, Integer, Integer> biFunction) { 

    }

    static void usarZero () { 

    }

    static void usarNada (OperarNada operarNada) { 

    }

    @FunctionalInterface
    interface ZeroArgumentos {
        int get();
    }

    @FunctionalInterface
    interface OperarNada {
        void nada();
    }
}
