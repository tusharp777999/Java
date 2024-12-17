package com.tushar.beans;

public class Test {

	public static void main(String[] args) {
		Greeting englisgGreeting = new EnglishGreeting();
		englisgGreeting.greet();
		
		Greeting hindiGreeting = new HindiGreeting();
		hindiGreeting.greet();
	}

}
