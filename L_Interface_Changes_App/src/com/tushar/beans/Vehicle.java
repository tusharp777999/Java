package com.tushar.beans;

public interface Vehicle {
	void cleanVehicle();//By default it having public abstract keyword. It is abstract method.
	
	default void sensor() {
		System.out.println("Sensor added!!!");
	}
	
	default void startVehicle() {// Default method with default keyword which is concrete method and valid in interface.
		System.out.println("Vehicle started!!!");
	}
	
	static void fuelCheck() {
		System.out.println("Checking fuel!!!");
	}
}
