package com.voya.threadsBasics;

public class Child extends  Thread{

    Child(String name, int priority){
        System.out.println(this);
//        this.start();
    }
    @Override
    public void run() {
        for (int i=1; i<11; i++){
            String name = Thread.currentThread().getName();
            System.out.println((i+ "x"+i+"=" +(i*5) +name));
            try {
                Thread .sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }



        }
    }


}
