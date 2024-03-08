package com.voya.oops.inheritance;

public class InManager extends InEmployee {
    double salary;

    InManager(){
        employeeID=303108;
        employeeName="rahul";
    }
    void printBonus(double amount){
        System.out.println(salary+amount);
    }

}
