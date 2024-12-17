package com.tushar.beans;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallableDemo1 {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		executorService.submit(() -> {
			for(int i = 0; i <= 10; i++) {
				System.out.println(i);
			}
			return null;
		});
	}
}
