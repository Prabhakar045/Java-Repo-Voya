package com.voya.Employeee;

import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {
        /*

        Employee emp = new Employee("Prabhkar","AM");

        double basic = emp.calcBonuc(3000.00);
        System.out.println(basic);

        double basic1= emp.calcBonuc(200.00,3000.00,"Shoes");
        System.out.println(basic1);

        double basic2 = emp.calcBonuc(2000.00, "iPhone 15",5000.00,2300.00);
        System.out.println(basic2);

         */

        Scanner sc = new Scanner(System.in);
        for(int i=0; i<3; i++){
            String name = sc.nextLine();
            String designation = sc.nextLine();
            Employee emp = new Employee(name,designation);

            if(designation.equals("Programmer")){
                double basic = emp.calcBonuc(3000.00);
                System.out.println(basic);
            } else if (designation.equals("Manager")) {
                double basic1= emp.calcBonuc(200.00,3000.00,"Shoes");
                System.out.println(basic1);
            } else if (designation.equals("Director")) {
                double basic2 = emp.calcBonuc(2000.00, "iPhone 15",5000.00,2300.00);
                System.out.println(basic2);
            }
        }


        String names[] ={"Prabhakar", "Allwin", "RAhul"};

        for(int j=0; j< names.length;j++){
            Employee emp = new Employee();
            Scanner sc1 = new Scanner(System.in);
            String sedc = sc1.nextLine();
            if(names[j].equals("Programmer")){
                double basic = emp.calcBonuc(3000.00);
                System.out.println(basic);
            } else if (names[j].equals("Manager")) {
                double basic1= emp.calcBonuc(200.00,3000.00,"Shoes");
                System.out.println(basic1);
            } else if (names[j].equals("Director")) {
                double basic2 = emp.calcBonuc(2000.00, "iPhone 15",5000.00,2300.00);
                System.out.println(basic2);
            }
        }
    }
}
