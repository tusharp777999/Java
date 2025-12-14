package com.tushar.function;

import java.util.Locale;
import java.util.function.Function;

public class Program1Function {
    public static void main(String[] args) {

        //Use of apply().
        Function<String, String> function1 = str1 -> str1.toUpperCase();
        Function<String, String> function2 = str1 -> str1.toLowerCase();
        System.out.println(function1.apply("Tushar"));

        //Use of andThen().
        System.out.println(function1.andThen(function2).apply("Tushar"));

        //Use of compose().
        System.out.println(function1.compose(function2).apply("Tushar"));

        //Use of identity().
        Function<String, String> function3 = Function.identity();
        System.out.println(function3.apply("Kesar"));
    }
}
