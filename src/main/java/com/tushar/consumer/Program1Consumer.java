package com.tushar.consumer;

import java.util.function.Consumer;

public class Program1Consumer {
    public static void main(String[] args) {
        //Consumer<String> consumer1 = str1 -> System.out.println(str1);
        Consumer<String> consumer1 = System.out::println;//Method reference.
        consumer1.accept("Tushar");
    }
}
