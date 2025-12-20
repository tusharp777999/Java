package com.tushar.stream.questions;

/*
*Given a sentence find the occurrence of each word.
*I/P: String str = "I am learning Streams API in Java Java";
* O/P: {I = 1, am = 1, learning = 1, Streams = 1, API = 1, in = 1, Java = 2}
*/

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program05 {
    public static void main(String[] args) {
        String str = "I am learning Streams API in Java Java";
        Map<String, Long> mapData = Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        System.out.println(mapData);
    }
}
