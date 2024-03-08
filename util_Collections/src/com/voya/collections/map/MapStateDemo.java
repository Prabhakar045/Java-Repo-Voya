package com.voya.collections.map;

import com.voya.collections.custom.Book;

import java.util.*;

public class MapStateDemo {
    public static void main(String[] args) {

        Map<String, List<String>> stateMap = new HashMap<>();
        stateMap.put("Karnataka", Arrays.asList("Bengaluru","Mysore","kalaburagi"));
        stateMap.put("Maharastra",Arrays.asList("pune","nagapur","mumbai"));
        stateMap.put("Kerala",Arrays.asList("Kochhi","Trivandrum","Vaynad"));


        Set<Map.Entry<String,List<String>>> entities = stateMap.entrySet();

        for(Map.Entry<String,List<String>> entry : entities){
            System.out.println(entry.getKey());
            List<String> cities = entry.getValue();

            for(String city:cities){
                System.out.println(city);
            }
        }
    }
}
