package com.tushar.beans;

public class MyApp {
	public static void main(String[] args) {
		Vehicle santroVehicle = new Santro();
		santroVehicle.cleanVehicle();
		santroVehicle.startVehicle();
		
		Vehicle i20Vehicle = new I20Car();
		i20Vehicle.cleanVehicle();//It is abstract method which is implemented in the implementation classes and and called using implementation class object.
		i20Vehicle.startVehicle();//Default method call which is not overridden in I20Car and called using implementation class object.
		i20Vehicle.sensor();//Default method call which is overridden in I20Car class and called using implementation class object.
		Vehicle.fuelCheck();//Static method call
	}
}
