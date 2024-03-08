package com.voya.oppsBasics;

public class Employee {

    int emp_id;
    String empName;
    double salary;

    public Employee(){

    }
    public Employee(int emp_id, String empName, double salary) {
        this.emp_id = emp_id;
        this.empName = empName;
        this.salary = salary;
    }

    void getDetails(){
        System.out.println("Id: " +emp_id);
        System.out.println("Name "+empName);
        System.out.println("Salary: "+salary);


    }

    void greets(String msg){
        System.out.println(empName);

    }



}
