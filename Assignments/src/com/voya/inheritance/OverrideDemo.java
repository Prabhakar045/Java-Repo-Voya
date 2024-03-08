package com.voya.inheritance;

public class OverrideDemo {

    public static void main(String[] args) {

        Sports sports = new Indoor();
        String[] indoorGames=sports.showTypes();

        for(String game:indoorGames){
            System.out.println(game);
        }


        Sports sports1 = new Outdoor();
        String[] iGames=sports.showTypes();

        for(String game:iGames){
            System.out.println(game);
        }
    }
}
