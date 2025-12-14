package com.tushar.stream.questions;

/*
* Write a stream program to multiply alternative numbers in an array.
* I/P: int[] array = {4, 5, 1, 7, 2, 9, 2};
* O/P: 16
*/

import java.util.stream.IntStream;

public class Program17 {
    public static void main(String[] args) {
        int[] array = {4, 5, 1, 7, 2, 9, 2};

        //For even sequence.
        int evenResult = IntStream.range(0, array.length).filter(index -> index % 2 == 0).map(data -> array[data]).reduce(1, (a,b) -> a * b);
        System.out.println(evenResult);

        //For odd sequence
        int oddResult = IntStream.range(0, array.length).filter(index -> index % 2 != 0).map(data -> array[data]).reduce(1, (a, b) -> a * b);
        System.out.println(oddResult);
    }
}
