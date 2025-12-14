package com.tushar.stream.questions;

/*
 * Find the sum of all the elements in list.
 * I/P: List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
 * O/P: 15
 */

import java.util.Arrays;
import java.util.List;

public class Program22 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        int result = list.stream().mapToInt(data -> (int)data).sum();
        System.out.println(result);

        int result1 = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println(result1);

        int result2 = list.stream().reduce(0,(a, b) -> a + b);
        System.out.println(result2);

        int result3 = list.stream().reduce(0, Integer::sum);
        System.out.println(result3);
    }
}
