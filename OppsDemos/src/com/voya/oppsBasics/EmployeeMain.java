package com.voya.oppsBasics;

public class EmployeeMain {
    public static void main(String[] args) {

        Employee emp = new Employee(303107,"Prabhakar",21000.00);
        /*
        emp.emp_id=303107;
        emp.empName="Prabhakar";
        emp.salary=21000.00;
        */

        Employee emp1 = new Employee(303108,"Allwin",21000.00);

        emp1.emp_id=303108;
        emp1.empName="Allwin";
        emp1.salary=21000.00;


        emp.getDetails();
        emp1.getDetails();

        emp.greets("Welcome back");
    }
}
