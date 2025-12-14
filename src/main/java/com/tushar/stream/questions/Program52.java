package com.tushar.stream.questions;

/*
* Print the middle character of the given string.
*/

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Program52 {
    public static void main(String[] args) {
        String str = "eduction";
        String result = IntStream.range(0, str.length())
                .filter(index -> (str.length() % 2 == 0) ? (index == (str.length()/2) -1 ) || index == (str.length()/2) : index == (str.length()/2))
                .mapToObj(index -> String.valueOf(str.charAt(index))).collect(Collectors.joining());
        System.out.println(result);
    }
}
