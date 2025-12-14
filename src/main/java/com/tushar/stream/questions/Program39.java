package com.tushar.stream.questions;

/*
* Multiply array elements.
* I/P: Integer[] array = {1, 2, 3, 4, 5};
* O/P: 120
*/

import java.util.Arrays;

public class Program39 {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5};
        int result = Arrays.stream(array).reduce(1, (a, b) -> a * b);
        System.out.println(result);
    }
}
