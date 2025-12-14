package com.tushar.stream.questions;

/*
 * Find and print the distinct odd numbers.
 * I/P: List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 10);
 * O/P: [1, 3, 5, 9]
 */

import java.util.Arrays;
import java.util.List;

public class Program25 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 8, 9, 9, 10);
        List<Integer> result = list.stream().distinct().filter(data -> data % 2 != 0).toList();
        System.out.println(result);
    }
}
