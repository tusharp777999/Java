package com.tushar.stream.questions;

/*
* Best practices to avoid common pitfalls when using Java Streams.
* 1.Limiting infinite streams and method use case.
*/

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Program47 {
    public static void main(String[] args) {

        //1.This code will go into infinite loop and cause a system crash better to use limit() here carefully.
        Stream<Integer> infiniteStream = Stream.iterate(1, x -> x + 1);
        infiniteStream.limit(10).forEach(System.out::println);

        //Solution: Better to use primitives as they are good in performance.
        IntStream infiniteIntStream = IntStream.iterate(1, x -> x + 1);
        infiniteIntStream.limit(10).forEach(System.out::println);

        //2.Incorrect usage of stream.
        //Here the issue is already the random() method generates the number, and it is input for iterate() as first parameter
        //even we know the random() method itself generates the number.
        Stream<Double> randomNumberGenerator1 = Stream.iterate(Math.random(), number -> Math.random());
        randomNumberGenerator1.limit(10).forEach(System.out::println);

        //Solution: Correct use.
        Stream<Double> randomNumberGenerator2 = Stream.generate(Math::random);
        randomNumberGenerator2.limit(10).forEach(System.out::println);
    }
}
