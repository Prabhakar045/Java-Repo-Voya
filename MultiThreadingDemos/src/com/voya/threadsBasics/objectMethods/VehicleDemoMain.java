package com.voya.threadsBasics.objectMethods;

public class VehicleDemoMain {

    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Maruti","Baleno","black");
        Vehicle vehicle2 = new Vehicle("TATA","Tiago","white");
        Vehicle vehicle3 = new Vehicle("BMW","sports","black");
        Vehicle vehicle4 = new Vehicle("Maruti","Baleno","black");

        System.out.println(vehicle1.equals(vehicle4));


    }
}
