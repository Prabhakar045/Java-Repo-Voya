package com.voya.bankAssignment;

import java.util.Scanner;

public class BankMain {

    public static void main(String[] args) {

        Bank bank = new Bank(5000);

        /*
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter choice");
        int choice = sc.nextInt();

        if(choice == 1){
            double withdrawAmount = sc.nextDouble();
            bank.withdraw(withdrawAmount);
        } else if (choice==2) {
            double depositAmount = sc.nextDouble();
            bank.deposit(depositAmount);
        } else if (choice ==3) {
            System.out.println(bank.getBalance());
        }else {
            System.out.println("Enter again!");
        }
        */


        bank.deposit(2000);
        double balance= bank.getBalance();
        System.out.println("Current balance after deposit: "+balance);
        bank.withdraw(1000);
        double balance1= bank.getBalance();
        System.out.println("Current balance after withdraw: "+balance1);


    }
}
