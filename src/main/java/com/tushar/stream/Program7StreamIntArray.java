package com.tushar.stream;

import com.tushar.stream.utility.Utility;

import java.util.Arrays;
import java.util.List;

public class Program7StreamIntArray {
    public static void main(String[] args) {
        List<Integer> list = Utility.getIntegers();
        //Integer[] arrayList = list.toArray(Integer[]::new);
        //Integer[] arrayList = list.toArray(new Integer[0]);
        Integer[] arrayList = list.stream().toArray(Integer[]::new);
        //Arrays.stream(arrayList).forEach(System.out::println);
        for(Integer data : arrayList){
            System.out.println(data);
        }
    }
}
