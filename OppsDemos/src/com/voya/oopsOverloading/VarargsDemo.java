package com.voya.oopsOverloading;

public class VarargsDemo {

    void calcSum(String name, int... marks){
        System.out.println("welcome "+name);
        int sum=0;
        for(int mark:marks){
            sum+= mark;
            System.out.println("sum "+sum);
        }
    }
     void calcSum(String name){
         System.out.println(name);
     }

    public static void main(String[] args) {
        VarargsDemo demo = new VarargsDemo();
        demo.calcSum("sri",90,80,90);
        demo.calcSum("prabhakar");
        demo.calcSum("allwin",90,80);
    }
}
