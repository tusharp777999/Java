package com.tushar.stream.questions;

/*
*Given a word, find the occurrence of each character.
* I/P: String str = "Mississippi";
* O/P: {M=1, s=4, i=4, p=2}
*/

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program08 {
    public static void main(String[] args) {
        String str = "Mississippi";
        Map<String, Long> data = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(data);
    }
}
