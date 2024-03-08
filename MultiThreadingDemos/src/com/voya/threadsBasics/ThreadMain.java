package com.voya.threadsBasics;

public class ThreadMain {

    public static void main(String[] args) {

        Thread thread = new Thread();
        System.out.println("1 "+thread);
        thread.setName("abc");
        thread.setPriority(Thread.MIN_PRIORITY);
        System.out.println("2 "+thread);
        thread.setName("rahul");

        try {
            int[] nums = null;
            System.out.println(nums[0]);
        }catch (NullPointerException e){
            e.getMessage();
        }
    }
}
