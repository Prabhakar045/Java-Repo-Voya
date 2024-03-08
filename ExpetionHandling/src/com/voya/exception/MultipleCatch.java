package com.voya.exception;

public class MultipleCatch {
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
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println("0");
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println("0");
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
            e.printStackTrace();

        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();

        }
    }
}
