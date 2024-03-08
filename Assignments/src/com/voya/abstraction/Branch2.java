package com.voya.abstraction;

public abstract class Branch2 extends Bank{


    @Override
    void houseLoan() {
        System.out.println("Branch2 class houseLoan impl");
    }

    @Override
    void educationLoan() {
        System.out.println("Branch2 class edu Loan impl");
    }

    void loanType(){
        System.out.println("easy EMI loan in branch2");
    }
}
