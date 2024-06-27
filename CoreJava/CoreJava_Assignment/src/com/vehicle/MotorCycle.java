package com.vehicle;

public class MotorCycle extends Vehicle{
	
	boolean hasFairing;
	
	@Override
	public void accelerate() {
		System.out.println("MotorCycle Accelerate upto 250Km/h");
	}
	@Override
	protected void break_() {
		System.out.println("MotorCycle Hydraulic disc break, Available");		
	}
	public MotorCycle() {
	}
	public MotorCycle(boolean hasFairing,String make, String model) {
		super();
		this.hasFairing = hasFairing;
		this.make = make;
		this.model = model;
		
	}
	
	
	
}
