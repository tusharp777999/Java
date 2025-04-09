package com.tushar;

public class NewThread extends Thread{
	@Override
	public void run() {
		System.out.println("RUNNING");
		try {
			Thread.sleep(2000);//Intentionally it is in sleep because we need to check its state.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws InterruptedException {
		NewThread newThread = new NewThread();
		System.out.println(newThread.getState());
		
		newThread.start();
		System.out.println(newThread.getState());
		
		//System.out.println(Thread.currentThread().getState()); //It will be in running state.
		
		Thread.sleep(100);//Intentionally we are sleeping the main thread to get the chance to 
						   //execute the new thread.
		System.out.println(newThread.getState());
		
		newThread.join();
		System.out.println(newThread.getState());
	}
}
