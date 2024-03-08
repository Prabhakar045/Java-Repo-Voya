package com.voya.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"java");
        map.put(2,"c");
        map.put(3,"spring");
        map.put(4,"code");
        map.put(5,"node");
        map.put(6,"spring boot");

        System.out.println(map);


        System.out.println(map.get(1));
        System.out.println(map.get(10));
        System.out.println(map.containsKey(1));

        System.out.println("----");
        Set<Integer> keys = map.keySet();
        for(Integer key : keys){
            System.out.println(map.get(key));
        }

        System.out.println("-------------------");

        Set<Map.Entry<Integer,String>> entities = map.entrySet();

        for(Map.Entry<Integer,String> entry : entities){
            System.out.println(entry.getKey() +entry.getValue());
        }
    }
}
