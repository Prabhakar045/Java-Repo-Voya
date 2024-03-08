package com.voya.exception;

public class ATM {
    public static void main(String[] args) {
        System.out.println("ATM");
        Bank bank = new Bank();

        try {
            bank.withdraw(1000);
            System.out.println("Amount withdraw");
        }catch (Exception e){
            System.out.println("exception....");
            System.out.println(e.getMessage());
        }

        System.out.println("good bye");
    }
}
