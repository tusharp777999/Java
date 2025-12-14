package com.tushar.stream;

import com.tushar.stream.utility.Utility;

import java.util.List;

public class Program6StreamForEach {
    public static void main(String[] args) {
        List<String> list = Utility.getVegetables();
        //list.forEach(System.out::println);
        //list.stream().forEach(str -> System.out.println(str));
        list.stream().forEach(System.out::println);
    }
}
