package com.voya.interfaceProject.defaultMethods;

public interface IBonusCalculator {

    void calculate(double amount);

    default void policyType(){
        System.out.println("policy for bonus");
    }

    static  void show(){

    }
}
