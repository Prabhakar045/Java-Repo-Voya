package com.voya.threadsBasics.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerialDEmo {
    public static void main(String[] args) {
        Student student = new Student("Prabhakar",303107,"CSE");

        try(
        FileOutputStream fileOutputStream = new FileOutputStream("stud.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        ) {
            objectOutputStream.writeObject(student);
            System.out.println("completed");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
