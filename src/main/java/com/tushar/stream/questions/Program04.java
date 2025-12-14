package com.tushar.stream.questions;

/*
*Find the 2nd highest length of the word in a sentence.
*I/P: String str = "I am learning Streams API in Java."
* O/P: 7
*/

import java.util.Arrays;
import java.util.Comparator;

public class Program04 {
    public static void main(String[] args) {
        String str = "I am learning Streams API in Java.";
        //int length = Arrays.stream(str.split(" ")).sorted(Comparator.comparing(String::length).reversed()).skip(1).findFirst().get().length();
        int length = Arrays.stream(str.split(" ")).map(data -> data.length()).sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(length);
    }
}
