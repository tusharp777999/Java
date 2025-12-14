package com.tushar.stream.questions;

/*
*Given a sentence, find the word that has the 2nd highest length.
* I/P: String str = "I am learning Streams API in Java";
* O/P: Streams
**/

import java.util.Arrays;
import java.util.Comparator;

public class Program03 {
    public static void main(String[] args) {
        String str = "I am learning Streams API in Java";
        String[] strArray = str.split(" ");
        String answer = Arrays.stream(strArray).sorted(Comparator.comparing(String::length).reversed()).skip(2).findFirst().get();
        System.out.println(answer);
    }
}
