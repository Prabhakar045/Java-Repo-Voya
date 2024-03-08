package com.voya.virtualATM;

public class Savings extends Account{

    public Savings(double balance) {
        super(balance);
    }

    @Override
    void  withdraw(double amount){

        if (amount < balance){
            balance = balance-amount;
        }else {
            System.out.println("Not enough balance");
        }
    }

    @Override
    void  deposit(double amount){
        balance=balance+amount;
        System.out.println("Amount deposited: "+balance);
    }
}