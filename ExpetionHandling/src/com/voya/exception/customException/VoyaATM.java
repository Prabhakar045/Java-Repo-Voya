package com.voya.exception.customException;

public class VoyaATM {

    public static void main(String[] args) throws OutOfLimitException, NegativeBalanceException {

        VoyaBank voya = new VoyaBank(1000.0);
        voya.withdraw(2000.0);


    }
}
