package com.tushar.stream.questions;

/*
* Given a string print the count of a particular substring.
* I/P: String str = "byebyeBirdiebye!";
* Find the count of bye.
* O/P: 3
*/

import java.util.stream.IntStream;

public class Program56 {
    public static void main(String[] args) {
        //String str = "byebyeBirdiebye!";
        String str = "oxoxkbcoXjkoxljokx";
        String match = "ox";

        long result = IntStream.range(0, str.length() - match.length() + 1)
                .filter(i -> str.substring(i, i + match.length()).equals(match))
                .count();
        System.out.println(result);
    }
}
