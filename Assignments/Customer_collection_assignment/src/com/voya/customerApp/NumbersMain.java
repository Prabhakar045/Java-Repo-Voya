package com.voya.customerApp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumbersMain {

    public static void main(String[] args) {
        List<Integer>  numbers = Arrays.asList(4,3,6,7,8,9,12,11);

        List<Integer>  evenNumbers = new ArrayList<>();

        for (Integer num : numbers){
            if (num%2==0){
                evenNumbers.add(num);
            }
        }

        //Iterating even numbers
        for (Integer even:evenNumbers){
            System.out.println(even);
        }

    }
}
