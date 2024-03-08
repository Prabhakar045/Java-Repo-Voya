package com.voya.exception;

public class Multi {
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

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println("enter value");
        }catch (ArithmeticException | NullPointerException | NumberFormatException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println("0");
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
            e.printStackTrace();

        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();

        }
    }
}
