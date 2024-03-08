package com.voya.virtualATM;

import java.util.Scanner;

public class AtmMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Savings savingsAcc = new Savings(1500.0);
        Current currentAcc = new Current(2000.0);
    }
}
