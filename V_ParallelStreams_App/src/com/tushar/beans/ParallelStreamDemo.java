package com.tushar.beans;

import java.util.stream.Stream;

public class ParallelStreamDemo {
	public static void main(String[] args) {
		System.out.println("=====Serial Streaming=====");
		Stream.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
			  .forEach(number -> System.out.println(number + " : " + Thread.currentThread().getName()));
		System.out.println("=====Parallel Streaming=====");
		Stream.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
		      .parallel().forEach(number -> System.out.println(number + " : " + Thread.currentThread().getName()));
	}
}
