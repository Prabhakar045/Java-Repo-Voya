package com.voya.threadsBasics.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeSerialDemo {
    public static void main(String[] args) {


        try(
                FileInputStream fileInputStream = new FileInputStream("stud.ser");
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ) {

            Student student1 = (Student)objectInputStream.readObject();
            System.out.println(student1);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
