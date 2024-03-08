package com.voya.threadsBasics;

public class ThreadSleep {

    public static void main(String[] args) {

        Thread thread = Thread.currentThread();
        System.out.println("1 "+thread);

        for(int i=0; i<10; i++){
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
