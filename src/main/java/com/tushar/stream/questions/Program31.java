package com.tushar.stream.questions;

/*
* Calculate the average of all the numbers.
* I/P: List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
* O/P: 3.0
*/

import java.util.Arrays;
import java.util.List;

public class Program31 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        double avg = list.stream().mapToDouble(Integer::doubleValue).average().getAsDouble();
        System.out.println(avg);

        double avg1 = list.stream().mapToDouble(data -> (double)data).average().getAsDouble();
        System.out.println(avg1);
    }
}
