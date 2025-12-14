package com.tushar.stream.questions;

/*
* Given a list of strings, group them by their first character and count the number of strings in each group
* I/P: List<String> list = Arrays.asList("apple", "banana", "apricot", "cherry", "blueberry", "avocado");
* O/P: {a=3, b=2, c=1}
*/

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Program37 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "apricot", "cherry", "blueberry", "avocado");

        Map<Character, Long> result = list.stream().collect(Collectors.groupingBy(data -> data.charAt(0), Collectors.counting()));
        //Map<String, Long> result = list.stream().collect(Collectors.groupingBy(data -> data.substring(0,1), Collectors.counting()));
        System.out.println(result);
    }
}
