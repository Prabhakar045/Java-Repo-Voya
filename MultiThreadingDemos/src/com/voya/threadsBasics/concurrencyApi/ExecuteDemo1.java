package com.voya.threadsBasics.concurrencyApi;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuteDemo1 {
    public static void main(String[] args) {
        ExecutorService es  = Executors.newFixedThreadPool(20);
        es.execute(() -> {
            System.out.println("task1");
            Greetingss greet = new Greetingss();
            greet.message();
        });

        es.execute(() -> {
            System.out.println(" task2");
        });

        es.execute(() -> {
            System.out.println(" task3");
        });

    }
}
