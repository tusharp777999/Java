package com.tushar.stream.questions;

/*
* Given a string return the character with the maximum frequency in string.
* I/P: String str = "javadeveloper";
* O/P: e
*/

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program60 {
    public static void main(String[] args) {
        String str = "javadeveloper";
        String result = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue()).map(data -> data.getKey()).get();
        System.out.println(result);
    }
}
