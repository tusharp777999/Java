package com.tushar.beans;

public class I20Car implements Vehicle {
	@Override
	public void cleanVehicle() {
		System.out.println("I20 car is getting cleaned.");
	}
	
	@Override
	public void sensor() {
		System.out.println("Sensor overrided in I20 class!!!");
	}
}
