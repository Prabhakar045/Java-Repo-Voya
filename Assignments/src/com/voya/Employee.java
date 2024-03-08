package com.voya;

public class Employee {

    String empName;
    String designation;


    public Employee(String empName, String designation) {
        this.empName = empName;
        this.designation = designation;
    }

    public Employee() {

    }

    double calcBonuc(double basicAllowance){
        return  basicAllowance;
    }

    double calcBonuc(double basicAllowance,double houseAllowance, String gift){
        System.out.println(gift);
        return basicAllowance+houseAllowance;
    }

    double calcBonuc(double basicAllowance, String gift, double houseAllowance, double carAllowance){
        System.out.println(gift);
        return basicAllowance+houseAllowance+carAllowance;
    }


}
