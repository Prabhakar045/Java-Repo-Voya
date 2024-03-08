package com.voya.collections.custom;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompareLamda {
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

        Collections.sort(vehicles ,(o1,o2) ->  o1.getBrand().compareTo(o2.getBrand() ));
        Collections.sort(vehicles ,(o1,o2) ->  Double.compare(o1.getPrice(), o2.getPrice() ));

    }
}
