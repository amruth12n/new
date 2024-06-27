package com.vehicle;

class Motorcycle extends Vehicle {
	boolean hasFairing;
	
	public Motorcycle(String make, String model, boolean hasFairing) {
		super(make, model);
		this.hasFairing = hasFairing;
	}
	void accelerate() {
		System.out.println("Motorcycle is accelerating.");
	}
	void brake() {
		System.out.println("Motorcycle is braking.");
	}
	
	public void getDetails() {
        System.out.println("Motorcycle Make: " + make);
        System.out.println("Motorcycle Model: " + model);
        System.out.println("Is It Firing: " + hasFairing);
    }
}
