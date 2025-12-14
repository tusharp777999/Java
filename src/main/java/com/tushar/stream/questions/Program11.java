package com.tushar.stream.questions;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
 * Given a string, find the first non-repeated character.
 * I/P: String str = "Hello Word";
 * O/P: H
 */

public class Program11 {
    public static void main(String[] args) {
        String str = "Hello World";
        String result = Arrays.stream(str.split("")).filter(data -> str.indexOf(data) == str.lastIndexOf(data)).findFirst().get();
        System.out.println(result);

        String result1 = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(data -> data.getValue() == 1).map(convertData -> convertData.getKey())
                .findFirst().get();
        System.out.println(result1);

        char ch = str.chars().mapToObj(data -> (char) data).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(data1 -> data1.getValue() == 1).map(convertData1 -> convertData1.getKey())
                .findFirst().get();
        System.out.println(ch);
    }
}
