package com.voya.threadsBasics;



public class ExtendingThread  {



    public static void main(String[] args) {
        Child child1 = new Child("child-1",10);
        child1.setDaemon(true);
//        child1.setName(" child-one");
//        System.out.print(child1);
//        child1.start();


        Child child2 = new Child("child-2",5);
//        child2.setName(" child-two");
//        child2.start();
//        System.out.print(child2);

   //     Thread thread  = new Thread();  //1st step
//        thread.setName("first thread");
//        System.out.println(thread);
//        thread.start();

        for(int i =0; i<5; i++){

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

//        try {
//            child2.join();
//            child1.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
    }
}
