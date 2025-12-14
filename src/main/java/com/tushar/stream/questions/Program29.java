package com.tushar.stream.questions;

/*
 * Find and print the strings containing only digits.
 * I/O: List<String> list = Arrays.asList("123", "abc", "123abc", "45");
 * O/P: [123, 45]
 */

import java.util.Arrays;
import java.util.List;

public class Program29 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("123", "abc", "123abc", "45");
        List<String> result = list.stream().filter(data -> data.matches("[0-9]+")).toList();
        System.out.println(result);
    }
}
