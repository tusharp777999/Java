package com.tushar.stream.questions;

/*
* Generate the first 10 numbers of the Fibonacci.
* O/P: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
*/

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Program34 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;

        System.out.print(a + " ");
        for (int i = 1; i < 10; i++) {
            System.out.print(b + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }

        List<Integer> result = Stream.iterate(new int[]{0, 1}, f -> new int[] {f[1], f[0]+f[1]}).limit(10).map(f->f[0]).toList();
        System.out.print(result);
    }
}
