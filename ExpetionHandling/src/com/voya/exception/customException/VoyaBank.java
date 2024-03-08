package com.voya.exception.customException;

public class VoyaBank {

    double balance;

    public VoyaBank(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) throws NegativeBalanceException, OutOfLimitException{

        System.out.println();
        try{
            if(amount>1000){
                throw new OutOfLimitException("limit exceeded");
            }
            if(balance-amount <= 0){
                throw new NegativeBalanceException("balance is -ve");
            }
            balance=balance-amount;
            System.out.println("Balance: "+balance);
        } catch (NegativeBalanceException e) {
            System.out.println("Negative balance" + e.getMessage());
            throw  e;
        }catch (OutOfLimitException e){
            System.out.println("limit exceeded" +e.getMessage());
            throw e;
        }finally {
            System.out.println("close all the costly resources");
        }
        System.out.println("done");
    }
}
