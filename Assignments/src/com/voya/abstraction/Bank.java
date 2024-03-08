package com.voya.abstraction;

public abstract class Bank {

    abstract void carLoan();
    abstract  void houseLoan();
    abstract  void educationLoan();

    void admin(){
        System.out.println("admin bank details");
    }

}
