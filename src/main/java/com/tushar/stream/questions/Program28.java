package com.tushar.stream.questions;

/*
 * Remove all non-numeric characters from a list.
 * I/P: List<String> list = Arrays.asList("a1b2c3", "1a2b3c", "123abc");
 * O/P: [123, 123, 123]
 */

import java.util.Arrays;
import java.util.List;

public class Program28 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a1b2c3", "1a2b3c", "123abc");
        List<String> result = list.stream().map(data -> data.replaceAll("[a-zA-Z]", "")).toList();
        System.out.println(result);

        List<Integer> result1 = list.stream().map(data -> data.replaceAll("[a-zA-Z]", "")).map(Integer::parseInt).toList();
        System.out.println(result1);
    }
}
