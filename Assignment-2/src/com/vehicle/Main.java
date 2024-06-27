package com.vehicle;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Mercedes", "Benz", 4);
        Motorcycle myMotorcycle = new Motorcycle("Royal Enfield", "Hunter 350", true);
        
        System.out.println("Car:");
        myCar.accelerate();
        myCar.brake();
        System.out.println("\nCar details");
        myCar.getDetails();
        
        System.out.println("\nMotorcycle:");
        myMotorcycle.accelerate();
        myMotorcycle.brake();
        System.out.println("\nMotorcycle details");
        myMotorcycle.getDetails();

    }
}
