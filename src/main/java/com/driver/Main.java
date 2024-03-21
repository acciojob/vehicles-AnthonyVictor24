package com.driver;

public class Main {
    public static void main(String[] args) {
//        F1 mercedes = new F1("mercedes", false);
//        mercedes.move(40, 0);
//        mercedes.accelerate(20);
//        mercedes.steer(90);
//        mercedes.steer(10);
//        mercedes.accelerate(-60);
//        System.out.println("Current direction is: "+mercedes.getCurrentDirection());

//        System.out.println();
//        System.out.println();
//        System.out.println();

        F1 benz = new F1("BENZ",false);
        benz.move(0,45);
//        benz.accelerate(0);
//        benz.steer(45);
//        benz.accelerate(50);
//        benz.accelerate(50);
//        benz.accelerate(50);
//        benz.accelerate(50);
//        benz.accelerate(50);
        benz.accelerate(-100);
        System.out.println("The CurrentSpeed is: "+benz.getCurrentSpeed());
        benz.accelerate(-200);
        System.out.println("The CurrentSpeed is: "+benz.getCurrentSpeed());
        benz.accelerate(300);
        System.out.println("The CurrentSpeed is: "+benz.getCurrentSpeed());
        benz.accelerate(-200);
        System.out.println("The CurrentSpeed is: "+benz.getCurrentSpeed());
        benz.accelerate(-200);
        System.out.println("The CurrentSpeed is: "+benz.getCurrentSpeed());

//        System.out.println("Current direction is: "+benz.getCurrentDirection());



        Boat b1 = new Boat("Titanic",500);
//        String vehicleName = b1.getVehicleName();
//        int vehicleCapacity = b1.getVehicleCapacity();
        b1.getVehicleName();
        b1.getVehicleCapacity();
//        System.out.println(vehicleName);
//        System.out.println(vehicleCapacity);
    }
}