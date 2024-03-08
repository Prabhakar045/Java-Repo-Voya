package com.voya.StudentAssignment;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String name1 = sc.nextLine();

        System.out.print("Department: ");
        String dept = sc.nextLine();

        System.out.println("Enter subjects: ");
        int subject = sc.nextInt();

        int[] marks1 = new int[subject];
        System.out.println("Maerks for each subject: ");
        for (int i=0; i<subject;i++){
            System.out.println((i+1));
            marks1[i] = sc.nextInt();
        }

        Student std1 = new Student(name1,dept);
        std1.printDetailss();
        System.out.println(std1.getGrades(marks1));


        sc.nextLine();

        System.out.print("Name: ");
        String name2 = sc.nextLine();

        System.out.print("Department: ");
        String dept1 = sc.nextLine();

        System.out.println("Enter subjects: ");
        int subject1 = sc.nextInt();

        int[] marks2 = new int[subject];
        System.out.println("Maerks for each subject: ");
        for (int i=0; i<subject;i++){
            System.out.println((i+1));
            marks2[i] = sc.nextInt();
        }

        Student std2 = new Student(name1,dept);
        std1.printDetailss();
        System.out.println(std1.getGrades(marks2));

    }
}
