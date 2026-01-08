package com.tushar.stream.questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

/*
* Given an array of int.
* I/P:  int[] array = {1, 3, 6, 4, 2};
* O/P: 5
*/
public class Program65 {
    public static void main(String[] args) {
        int[] array = {1, 3, 6, 4, 2};
        //rangeClosed() creates a sequence of integers from provided start value to end value(included)
        //and range() exluded the end value so that's why we are using rangeClosed().
        //Providing the start value as 1 and the maximum value can be array length plus missing value so adding 1 in it
        IntStream.rangeClosed(1, array.length + 1)
                //Filtering the data based on providing the range values on by one and non-matching values we are
                //comparing with the provided array or else nothing is missing we are returning the -1.
                .filter(data -> IntStream.of(array).noneMatch(arrayData -> arrayData == data))
                .findFirst().orElse(-1);
    }
}
