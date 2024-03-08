package com.voya.collections.set;

import java.util.*;

public class HashDemo {

    public static void main(String[] args) {

//        HashSet<String> set = new HashSet<>();
        HashSet<String> set = new LinkedHashSet<>();
//        HashSet<String> set = new TreeSet<>();
        set.add("Apple");
        set.add("pineApple");
        set.add("Banana");
        set.add("Kiwi");
        set.add("100");
        set.add(null);

        for(String elements: set){
            System.out.println(elements);
        }

        List<String>  fruits = Arrays.asList("apple","orange","banana","apple");
        Set<String> newFruits = new HashSet<>(fruits);

        System.out.println(newFruits);
    }
}
