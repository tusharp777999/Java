package com.tushar.stream.questions;

/*
* Print all the distinct numbers in decending order  which starts with '1'
* I/P: int[] array = {12, 34, 11, 34, 67, 121, 121, 52, 78, 114, 565, 1643, 11};
* O/P: 1643 121 114 12 11
*/

import java.util.Arrays;
import java.util.Comparator;

public class Program53 {
    public static void main(String[] args) {
        int[] array = {12, 34, 11, 34, 67, 121, 121, 52, 78, 114, 565, 1643, 11};
        Arrays.stream(array)
                .distinct()
                .filter(data -> String.valueOf(data).startsWith("1"))
                .boxed()
                .sorted((a, b) -> -a.compareTo(b))
                .forEach(System.out::println);

        Arrays.stream(array)
                .distinct()
                .filter(data -> String.valueOf(data).startsWith("1"))
                .boxed()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
