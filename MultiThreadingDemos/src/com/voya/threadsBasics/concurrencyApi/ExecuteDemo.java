package com.voya.threadsBasics.concurrencyApi;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuteDemo {
    public static void main(String[] args) {

        ExecutorService es = Executors.newFixedThreadPool(10);

        for(int i=0; i<=10; i++){
            es.execute(() -> {
                System.out.println("doing task");
            });
        }
        es.shutdown();
    }
}
