package com.vehicle;

class Car extends Vehicle {
	int numOfDoors;
	public Car(String make, String model, int numOfDoors) {
		super(make, model);
		this.numOfDoors = numOfDoors;
	}
 
	void accelerate() {
		System.out.println("Car is accelerating.");
	}
	void brake() {
		System.out.println("Car is braking.");
	}
	
	public void getDetails() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Number of Doors: " + numOfDoors);
    }
}
