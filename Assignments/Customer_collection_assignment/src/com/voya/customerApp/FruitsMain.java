package com.voya.customerApp;

import java.util.ArrayList;
import java.util.List;

public class FruitsMain {

    public static void main(String[] args) {

        List<String> fruitsList = new ArrayList<>();
        fruitsList.add("Apple");
        fruitsList.add("Banana");
        fruitsList.add("Green Apple");
        fruitsList.add("Grapes");
        fruitsList.add("Dragon fruit");
        fruitsList.add("Apple1");



        List<String> fruitsWithA = new ArrayList<>();


        String startLetter = "A";
        for (String fruits:fruitsList){
            if(fruits.startsWith(startLetter)){
                fruitsWithA.add(fruits);
            }
        }

        for(String fruitsStartWithA: fruitsWithA){
            System.out.println(fruitsStartWithA);
        }

        System.out.println(fruitsWithA);
        List<String> fruitsWithB = new ArrayList<>();

        String startLetter1 = "b";
        for (String fruits:fruitsList){
            if(fruits.startsWith(startLetter1)){
                fruitsWithB.add(fruits);
            }
        }

    }
}
