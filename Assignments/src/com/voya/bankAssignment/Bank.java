package com.voya.bankAssignment;

public class Bank {

    double  balance;

    Bank(double balance){

        this.balance=balance;
    }

    public void withdraw(double amount){
        if (amount < balance){
            balance = balance-amount;
        }else {
            System.out.println("Not enough balance");
        }
    }

    public void deposit(double amount){
        balance=balance+amount;
        System.out.println("Amount deposited: "+balance);
    }

    public double getBalance(){

        return balance;
    }
}
