package com.driver;

public class Main {
    public static void main(String[] args) {
//        F1 mercedes = new F1("mercedes", false);
//        mercedes.move(40, 0);
//        mercedes.accelerate(20);
//        mercedes.accelerate(-60);


        F1 benz = new F1("BMW",false);
        benz.move(20,0);
        benz.accelerate(30);
        benz.steer(45);
        benz.accelerate(50);
        benz.accelerate(50);


        Boat b1 = new Boat("Titanic",500);
        String vehicleName = b1.getVehicleName();
        int vehicleCapacity = b1.getVehicleCapacity();
//        b1.getVehicleName();
//        b1.getVehicleCapacity();
        System.out.println(vehicleName);
        System.out.println(vehicleCapacity);
    }
}