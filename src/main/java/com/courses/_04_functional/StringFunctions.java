package com.courses._04_functional;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class StringFunctions {
    
    public static void main(String[] args) {
        UnaryOperator<String> quote = text -> "\"" + text + "\"";

        System.out.println(quote.apply("Hola mundo"));

        UnaryOperator<String> addMark = text -> text + "!";
        System.out.println(addMark.apply("Hola mundo"));

        BiFunction<Integer, Integer, Integer> multiply = (x, y) -> x * y;

        System.out.println(multiply.apply(2, 3));

        BinaryOperator<Integer> multiply2 = (x, y) -> x * y;

        System.out.println(multiply2.apply(2, 3));

        /* BiFunction<String, Integer, String> leftPad = (text, number) -> String.format("%", number, "s", text);

        leftPad.apply("Java", 10); */
    }
}
