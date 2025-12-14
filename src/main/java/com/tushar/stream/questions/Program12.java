package com.tushar.stream.questions;

/*
* Given a string, find the first repeated character.
* I/P: String str = "Hello Word";
* O/P: l
*/

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program12 {
    public static void main(String[] args) {
        String str = "Hello Word";
        String result = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(data -> data.getValue() > 1).map(convertedData -> convertedData.getKey())
                .findFirst().get();
        System.out.println(result);
    }
}
