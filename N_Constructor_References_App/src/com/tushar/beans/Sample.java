package com.tushar.beans;

public class Sample {
	public static void main(String[] args) {
		SampleInterface sampleInterface = () -> new Sample();
		SampleInterface sampleInterface1 = Sample::new;
	}
}

interface SampleInterface {
	Sample get();
}