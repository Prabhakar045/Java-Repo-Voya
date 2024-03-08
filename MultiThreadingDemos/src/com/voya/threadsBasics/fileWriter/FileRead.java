package com.voya.threadsBasics.fileWriter;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileRead {
    public static void main(String[] args) {

        InputStreamReader iReadee=new InputStreamReader(System.in);

        BufferedReader bufferedReader = new BufferedReader(iReadee);
        FileOutputStream file = null;
        try {
             file = new FileOutputStream("demo.txt");
            char c = (char) bufferedReader.read();
            while (c!= 'q'){

                c = (char)bufferedReader.read();
                System.out.print(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                file.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
