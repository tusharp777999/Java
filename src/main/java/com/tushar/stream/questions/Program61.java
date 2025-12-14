package com.tushar.stream.questions;

/*
* Given a list of string, return a map of the string and its length.
* I/P: List<String> fruits = Arrays.asList("Orange", "Banana", "Kiwi");
* O/P: {banana=6, Orange=6, Kiwi=4}
*/

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program61 {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Orange", "Banana", "Kiwi", "Orange");
        Map<String, Integer> result = fruits.stream()
                .collect(Collectors.toMap(Function.identity(), String::length, (existing, duplicate) -> existing));
        System.out.println(result);
    }
}
