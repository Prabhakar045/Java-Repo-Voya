package com.voya.threadsBasics.run;

public class Greetings {

    String message(String name){

        String result = null;
        try {
            System.out.println("hi "+ name);
            Thread.sleep(2000);
            result="Greet day "+name;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("welcome "+name);
        return "welcome "+name;
    }
}
