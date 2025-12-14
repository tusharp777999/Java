package com.tushar.stream.questions;

/*
* Convert a list of integers to a list of their squares.
* I/P: List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
* O/P: [1, 4, 9, 16, 25]
*/

import java.util.Arrays;
import java.util.List;

public class Program35 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> result = list.stream().map(data -> data * data).toList();
        System.out.println(result);
    }
}
