package com.voya.interfaceProject;

public class ManagerDeatils implements IEntertainment {
    @Override
    public void showGames(String type) {
        if (type.equals("indoor")){
            System.out.println("chess and tennis are vaialble");
        }else {
            System.out.println("foootbal");
        }
    }

    @Override
    public void showActivity() {
        System.out.println("weekly lounch outing");
    }
}
