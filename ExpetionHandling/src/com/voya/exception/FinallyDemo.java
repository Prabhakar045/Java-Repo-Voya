package com.voya.exception;

public class FinallyDemo {
    public static void main(String[] args) {


        try{
            System.out.println("welcome");
            String value=args[0];
            System.out.println("Value: "+value);
            int num = Integer.parseInt(value);
            System.out.println(num);
            int result = 100/num;
            System.out.println(result);
            int marks[] = null;
            System.out.println(marks[0]);

        }catch (ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException | NumberFormatException e){
            System.out.println(e.getMessage());

            System.out.println("0");
        }catch (RuntimeException e){
            System.out.println(e.getMessage());


        }catch (Exception e){
            System.out.println(e.getMessage());


        }finally {
            System.out.println("close the all the costly resources/connections");
        }
        System.out.println("completed");
    }
}
