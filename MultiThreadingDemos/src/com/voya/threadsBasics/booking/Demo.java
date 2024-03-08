package com.voya.threadsBasics.booking;

import com.voya.threadsBasics.run.Runner;

public class Demo {
    public static void main(String[] args) {

        Runnable rr = () -> {
            System.out.println("task1");
        };

       Thread thread1 = new Thread(rr, "pbk");
       thread1.start();

       Thread thread2 = new Thread(() -> {
            System.out.println("task2");
        },"top");
       thread2.start();
    }
}
