package com.voya.oops.inheritance;

public class InEmployeeMain {

    public static void main(String[] args) {

        InEmployee in = new InEmployee();
        in.getDetails();

        InManager inM= new InManager();
        inM.getDetails();
        inM.printBonus(1000);
    }
}
