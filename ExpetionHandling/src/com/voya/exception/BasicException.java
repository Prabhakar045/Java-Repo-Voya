package com.voya.exception;

public class BasicException {
    public static void main(String[] args) {


        try{
            System.out.println("welcome");
            String value=args[0];
            System.out.println("Value: "+value);
            int num = Integer.parseInt(value);
            System.out.println(num);
            int result = 100/num;
            System.out.println(result);


        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();

        }
    }
}
