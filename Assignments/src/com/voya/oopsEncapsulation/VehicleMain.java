package com.voya.oopsEncapsulation;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setModel("i20");
        vehicle.setBrand("Maruti");
        vehicle.setPrice(120000.0);

        System.out.println(vehicle.getModel()+" "+vehicle.getBrand()+" " +vehicle.getPrice());
        System.out.println(vehicle);
    }
}
