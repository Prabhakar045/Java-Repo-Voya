package com.voya.exception;

public class Bank {

    double balance;

    void  withdraw(int amount) throws Exception {
        System.out.println("bank");
        try{
            if(amount>1000)
                throw new Exception("amount greater than 1000");
            balance = balance-amount;
            System.out.println(balance);

        }catch (Exception e){
            System.out.println("errors..");
            throw e;
        }finally {
            System.out.println("close resources");
        }
        System.out.println("completed");
    }
}
