package com.voya.threadsBasics.fileWriter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWrite {
    public FileWrite(String s) {
    }

    public static void main(String[] args) {

        InputStreamReader iReadee=new InputStreamReader(System.in);

        BufferedReader bufferedReader = new BufferedReader(iReadee);

        try {
            char c = (char) bufferedReader.read();
            while (c!= 'q'){

                c = (char)bufferedReader.read();
                System.out.print(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
