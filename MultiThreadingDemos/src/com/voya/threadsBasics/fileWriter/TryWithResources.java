package com.voya.threadsBasics.fileWriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResources {

    public static void main(String[] args) {

        try (
                FileWriter fileWrite = new FileWriter("trail.txt");
                FileReader fileRead = new FileReader("demo.txt");) {

            int num = fileRead.read();
            fileWrite.write((char) num);
            do {
                num = fileRead.read();
                fileWrite.write((char) num);

            }while(num != -1);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
