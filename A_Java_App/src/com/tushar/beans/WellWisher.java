package com.tushar.beans;

public class WellWisher {

	public static void wish(Greeting greeting) {
		greeting.greet();
	}
	
	public static void main(String[] args) {
		Greeting hindiGreeting = new HindiGreeting();
		wish(hindiGreeting);
		
		Greeting englishGreeting = new EnglishGreeting();
		wish(englishGreeting);
	}

}
