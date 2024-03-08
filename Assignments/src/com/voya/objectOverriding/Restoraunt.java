package com.voya.objectOverriding;

public class Restoraunt {

    public static void main(String[] args) {

        //As relation
        //Is
        Menu menu = new Chinese();
        menu.showItems("Breakfast");



        Menu menu1 = new Indian();
        menu1.showItems("lunch");

        Indian indian =(Indian) menu1;
        indian.showItems("Breakfast");


    }
}
