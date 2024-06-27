package com.vehicle;

public abstract class Vehicle {
	String make;
	String model;
	
	public Vehicle(String make, String model) {
		this.make = make;
		this.model = model;
	}
 
	abstract void accelerate();
	abstract void brake();
}

