package com.voya.interfaceProject;

public class InterMain {
    public static void main(String[] args) {
        IEntertainment entertainment = new ManagerDeatils();
        entertainment.showGames("indoor");
        entertainment.showActivity();

        entertainment = new DevelopersDetails();
        entertainment.showActivity();
        entertainment.showGames("outdoor");

        ICompressor iCompressor = new ZipCompressor();
       String[] zip = iCompressor.compresFiles("file1","file2");
        System.out.println(zip);

    }

}
