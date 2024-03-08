package com.voya.collections.custom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class VehicleMain {
    public static void main(String[] args) {

        List<Vehicle> vehicles= Arrays.asList(
           new Vehicle("Honda city","Honda",1800000.0),
           new Vehicle("Baleno","Maruthi suzuki",1200000.0),
           new Vehicle("Creta","Honda",1500000.0),
           new Vehicle("Aulto","Maruthi suzuki",1800000.0)
        );

        for(Vehicle vehicle:vehicles){
            System.out.println(vehicle);
        }

        System.out.println("sort by brand");
        Collections.sort(vehicles,new BrandSort());
        for(Vehicle vehicle:vehicles){
            System.out.println(vehicle);
        }

        System.out.println("sort by model");
        Collections.sort(vehicles,new ModelSort());
        for(Vehicle vehicle:vehicles){
            System.out.println(vehicle);
        }

        System.out.println("sort by model");
        Collections.sort(vehicles,new PriceSort());
        for(Vehicle vehicle:vehicles){
            System.out.println(vehicle);
        }
    }
}
