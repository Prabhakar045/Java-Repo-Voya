package com.voya.staticBlock;

public class Demo {

    static {
        System.out.println("demo static block");
    }

    public static void main(String[] args) {
        System.out.println("main demo");

        try{
            Class.forName("com.voya.staticBlock.Trail");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        Trail.getMessage();
        System.out.println(Trail.x+Trail.y);
    }
}
