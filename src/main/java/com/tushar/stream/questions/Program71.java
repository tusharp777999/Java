package com.tushar.stream.questions;

import java.util.Arrays;
import java.util.List;

/*
* Given a list of integer need to find the integer which starts with 1 and output should be in integer only.
* I/P: int[] array = {10, 15, 8, 49, 25, 98, 32, 15, 98,145};
* O/P: [10, 15, 15, 145]
*/
public class Program71 {
    static void main() {
        int[] array = {10, 15, 8, 49, 25, 98, 32, 15, 98,145};
        List<Integer> objData = Arrays.stream(array).boxed().toList();
        List<Integer> result = objData.stream().filter(data -> data.toString().startsWith("1")).toList();
        System.out.println(result);
    }
}
