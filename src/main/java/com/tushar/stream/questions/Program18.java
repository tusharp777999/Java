package com.tushar.stream.questions;

/*
* Write a program to multiply 1st and Nth element, 2nd and Nth - 1 element etc numbers in an array.
* I/P: int[] array = {4, 5, 1, 7, 2, 9};
* O/P:  36
*       10
*       7
*/

import java.util.stream.IntStream;

public class Program18 {
    public static void main(String[] args) {
        int[] array = {4, 5, 1, 7, 2, 9};
        IntStream.range(0, array.length/2).map(data -> array[data] * array[array.length - data - 1]).forEach(System.out::println);
    }
}
