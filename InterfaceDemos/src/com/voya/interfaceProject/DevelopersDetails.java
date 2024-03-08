package com.voya.interfaceProject;

public class DevelopersDetails implements IEntertainment{
    @Override
    public void showGames(String type) {
        if (type.equals("indoor")){
            System.out.println("carrom and tennis are vaialble");
        }else {
            System.out.println("cricket");
        }
    }

    @Override
    public void showActivity() {
        System.out.println("weekly lounch outing");
    }
}
