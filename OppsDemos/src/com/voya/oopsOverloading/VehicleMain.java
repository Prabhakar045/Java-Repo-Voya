package com.voya.oopsOverloading;

public class VehicleMain {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.getDetails();
        System.out.println("\n");

        Vehicle vehicle1 = new Vehicle("BMW");
        vehicle1.getDetails();

        System.out.println("\n");

        Vehicle vehicle2 = new Vehicle("Maruti suzuki","Swift Dezire");
        vehicle2.getDetails();

        System.out.println("\n");

        Vehicle vehicle3 = new Vehicle("Mariti Suzuki",120000.00, "Baleno");
        vehicle2.getDetails();
    }
}
