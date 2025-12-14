package com.tushar.stream.questions;

/*
* Given an array find the sum of unique elements
* I/P: int[] array = {1, 6, 7, 8, 1, 1, 8, 8, 7};
* O/P: 22
*/

import java.util.Arrays;

public class Program10 {
    public static void main(String[] args) {
        int[] array = {1, 6, 7, 8, 1, 1, 8, 8, 7};
        int sum = Arrays.stream(array).distinct().sum();
        System.out.println(sum);
    }
}
