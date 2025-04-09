package com.tushar;

public class NewThread extends Thread{
	@Override
	public void run() {
		for(int j = 0; j < 10; j++) {
			System.out.println("NewThread :: " + Thread.currentThread().getName());
		}
	}
}
