package com.tushar.stream.questions;

import java.util.Arrays;
import java.util.Comparator;

/*
*Given a sentence, find the word which has highest length.
* I/P: "I am learning Streams API in Java."
* O/P: learning
**/
public class Program01 {
    public static void main(String[] args) {
        String str = "I am learning Streams API in Java.";
        String[] strArray = str.split(" ");
        //String answer = Arrays.stream(strArray).max((str1, str2) -> {Integer i1 = str1.length(); Integer i2 = str2.length();return i1.compareTo(i2);}).get();
        //String answer = Arrays.stream(strArray).max((str1, str2) -> Integer.compare(str1.length(), str2.length())).get();
        //String answer = Arrays.stream(strArray).max(Comparator.comparing(str1 -> str.length())).get();
        //String answer = Arrays.stream(strArray).max(Comparator.comparing(String::length)).get();
        String answer = Arrays.stream(strArray).sorted(Comparator.comparing(String::length).reversed()).findFirst().get();
        System.out.println(answer);
    }
}
