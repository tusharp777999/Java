package com.tushar.stream.questions;

/*
* Given a list of strings convert all strings to uppercase and then concatenate them into single string.
* I/P: List<String> alphabets = Arrays.asList("a", "b", "c", "d");
* O/P: ABCD
*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program41 {
    public static void main(String[] args) {
        List<String> alphabets = Arrays.asList("a", "b", "c", "d");
        String result = alphabets.stream().map(data -> data.toUpperCase()).reduce("", (a, b) -> a.concat(b));
        System.out.println(result);
        String result1 = alphabets.stream().map(data -> data.toUpperCase()).collect(Collectors.joining());
        System.out.println(result1);
    }
}
