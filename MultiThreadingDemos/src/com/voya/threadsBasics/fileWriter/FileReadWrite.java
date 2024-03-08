package com.voya.threadsBasics.fileWriter;

import java.io.*;

public class FileReadWrite {

    public static void main(String[] args) {
        FileWriter fileWrite = null;
        FileReader fileRead = null;


        try {
           fileWrite = new FileWriter("trail.txt");
            fileRead = new FileReader("demo.txt");

            int num = fileRead.read();
            fileWrite.write((char) num);
            do{
                num = fileRead.read();
                fileWrite.write((char)num);
            }while(num != -1);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {

            if(fileWrite != null) {
                try {
                    fileWrite.close();
                    fileRead.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
