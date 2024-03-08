package com.voya.threadsBasics.run;

public class Runner implements Runnable {
    String name;
    Greetings greeting;
    Runner(String name, Greetings greeting){
        Thread t = new Thread(this,name);
        this.name=name;
        this.greeting=greeting;
        t.start();
    }

    @Override
    public void run() {
        synchronized (greeting) {
            String name = Thread.currentThread().getName();
            System.out.println("done");
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("doneee...");
    }
}
