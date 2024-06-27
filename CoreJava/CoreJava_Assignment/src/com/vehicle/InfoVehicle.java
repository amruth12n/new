package com.vehicle;

public class InfoVehicle {

	public static void main(String[] args) {
		Car newCar = new Car(4,"Nissan","Magnite");
		MotorCycle newMotor = new MotorCycle(false, "Yamaha","MT 15 V2");
		
		System.out.println("CAr Brand: "+newCar.make+"\nModel: "+newCar.model+"\nNo.of doors: "+newCar.numOfDoors);
		newCar.accelerate();
		newCar.break_();
		
		System.out.println("\nMotor-Cycle Brand: "+newMotor.make+"\nModel"+newMotor.model+"\nFiring: "+newMotor.hasFairing);
		newMotor.accelerate();
		newMotor.break_();

	}

}
