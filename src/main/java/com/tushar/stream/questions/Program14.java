package com.tushar.stream.questions;

/*
* Given a list of strings, create a list that contains only integers.
* I/P: String[] stringArray = {"abc", "123", "456", "xyz"};
* O/P: [123, 456]
*/

import java.util.Arrays;
import java.util.List;

public class Program14 {
    public static void main(String[] args) {
        String[] stringArray = {"abc", "123", "456", "xyz"};
        List<Integer> result = Arrays.stream(stringArray).filter(data -> data.matches("[0-9]+")).map(Integer::valueOf).toList();
        System.out.println(result);

        //List<Integer> result1 = Arrays.stream(stringArray).filter(data -> data.matches("[0-9]+")).map(data -> Integer.valueOf(data)).toList();
        //System.out.println(result1);
    }
}
