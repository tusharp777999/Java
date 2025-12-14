package com.tushar.stream.questions;

/*
* Find the product of the first two elements from an array.
* I/P: int[] array = {12, 5, 6, 9, 2, 4};
* O/P: 60
*/

import java.util.Arrays;
import java.util.stream.IntStream;

public class Program15 {
    public static void main(String[] args) {
        int[] array = {12, 5, 6, 9, 2, 4};
        Integer result = Arrays.stream(array).boxed().toList()
                .stream().limit(2).reduce(1, (a, b) -> a * b);
        System.out.println(result);
        int result1 = IntStream.range(0, 2).map(data -> array[data]).reduce(1, (a, b) -> a * b);
        System.out.println(result1);
    }
}
