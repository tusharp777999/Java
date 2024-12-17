package com.tushar.beans;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallableDemo2 {
	public static void main(String[] args) {
		Callable callable = new Callable() {
			@Override
			public Object call() throws Exception {
				for(int i = 1; i <= 20; i++) {
					System.out.println(i);
				}
				return null;
			}
		};
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		executorService.submit(callable);
	}
}
