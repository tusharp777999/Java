package com.tushar.beans;

public class Demo5 {
	public static void main(String[] args) {
		Thread thread = new Thread(() -> {
			for(int i = 1; i <= 10; i++) {
				System.out.println(i);
			}
		});
		thread.start();
	}
}
