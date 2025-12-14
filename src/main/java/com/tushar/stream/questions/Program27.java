package com.tushar.stream.questions;

/*
 * Find the Kth smallest element in a list of integers without removing duplicate elements.
 * I/P: List<Integer> list = Arrays.asList(7, 1, 6, 2, 1, 3, 4, 5);
 * int k = 3
 * O/P: [2]
 */

import java.util.Arrays;
import java.util.List;

public class Program27 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(7, 1, 6, 2, 1, 3, 4, 5);
        int k = 3;

        int result = list.stream().sorted().skip(k-1).findFirst().get();
        System.out.println(result);
    }
}
