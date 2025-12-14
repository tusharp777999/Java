package com.tushar.stream.questions;

/*
* Given an int[] array, re-arrange the elements to from highest/lowest possible values.
* I/P: int[] array = {1, 2, 3, 4, 5};
* O/P: 54321/12345
*/

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Program09 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        Arrays.stream(array).mapToObj(data -> data).sorted().forEach(System.out::print);
        System.out.println();
        //Arrays.stream(array).mapToObj(data -> data).sorted(Collections.reverseOrder()).forEach(System.out::print);
        Arrays.stream(array).boxed().sorted(Comparator.reverseOrder()).forEach(System.out::print);
    }
}
