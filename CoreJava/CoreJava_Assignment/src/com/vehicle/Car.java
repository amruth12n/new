package com.vehicle;

public class Car extends Vehicle{
	protected int numOfDoors;
	@Override
	public void accelerate() {
		System.out.println("Car Accelerate upto 380Km/h");
	}
	@Override
	protected void break_() {
		System.out.println("Car Multi-functional break");		
	}
	public Car() {
	}
	public Car(int numOfDoors,String make, String model) {
		this.numOfDoors = numOfDoors;
		this.make = make;
		this.model = model;
	}
	
	
}
