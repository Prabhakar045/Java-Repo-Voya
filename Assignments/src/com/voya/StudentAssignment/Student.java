package com.voya.StudentAssignment;

public class Student {

    String name;
    String department;

    public Student(String name, String department) {
        this.name = name;
        this.department = department;
    }

    void printDetailss(){
        System.out.println("Name: "+name);
        System.out.println("Department: "+department);
    }

    public  String getGrades(int... marks){
        int sum=0;
        for(int mark:marks){
            sum=sum+mark;
        }

        double avrg = sum/ (double) marks.length;

        if (avrg >= 90){
            return "A";

        } else if (avrg >= 80) {
            return "B";
        } else if (avrg >= 70) {
            return "c";
        } else if (avrg >= 60) {
            return "d";
        } else if (avrg >= 50) {
            return "E";
        }else {
            return "fail";
        }
    }
}
