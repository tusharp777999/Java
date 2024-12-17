package com.tushar.beans;

public class Demo4 {
	public static void main(String[] args) {
		Runnable runnable = () -> {
			for(int i = 1; i <= 10; i++) {
				System.out.println(i);
			}
		};
		
		Thread thread = new Thread(runnable);
		thread.start();
	}
}
