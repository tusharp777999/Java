package com.tushar;

public class MainThread {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			System.out.println("Main :: " + Thread.currentThread().getName());
		}
		
		NewThread newThread = new NewThread();
		newThread.start();
	}
}
