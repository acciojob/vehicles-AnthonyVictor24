package com.driver;

public class Main {
    public static void main(String[] args) {
        F1 mercedes = new F1("mercedes", false);
        mercedes.move(40, 0);
        mercedes.accelerate(20);
//        mercedes.steer(90);
//        mercedes.steer(10);
        mercedes.accelerate(-60);

        Boat b1 = new Boat("Titanic",500);
        String vehicleName = b1.getVehicleName();
        int vehicleCapacity = b1.getVehicleCapacity();
        System.out.println(vehicleName);
        System.out.println(vehicleCapacity);
    }
}