package com.voya.abstraction;

public class Branch1 extends Bank{
    @Override
    void carLoan() {
        System.out.println("Branch1 class carLoan impl");
    }

    @Override
    void houseLoan() {
        System.out.println("Branch1 class houseLoan impl");
    }

    @Override
    void educationLoan() {
        System.out.println("Branch1 class edu Loan impl");
    }
}
