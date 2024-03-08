package com.voya.objectOverriding;

public class Chinese extends Menu{

    @Override
    void showItems(String type){
        System.out.println("Noodeles, Gobi");

        if (type.equals("starters")){
            System.out.println("Noodeles, Gobi");
        }
    }

    void printChineseFoodItems(){
        System.out.println("Noodeles, Gobi");
    }
}
