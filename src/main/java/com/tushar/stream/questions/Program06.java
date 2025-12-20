package com.tushar.stream.questions;

/*
*Given a sentence, find the words with a specified number of vowels.
* I/P: String str = "I am learning Streams API in Java.";
* int vowels = 2;
* O/P: Streams, API, Java
*/

import java.util.Arrays;

public class Program06 {
    public static void main(String[] args) {
        String str = "I am learning Streams API in Java.";
        Arrays.stream(str.split(" ")).filter(data -> data.replaceAll("[^aeiouAEIOU]", "").length() == 2).forEach(System.out::println);
    }
}
