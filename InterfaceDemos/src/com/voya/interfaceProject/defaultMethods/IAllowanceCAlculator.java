package com.voya.interfaceProject.defaultMethods;

public interface IAllowanceCAlculator {

    void calculate(double amount);

    default void policyType(){
        System.out.println("policy for bonus");
    }
}
