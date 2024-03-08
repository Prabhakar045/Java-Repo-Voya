package com.voya.interfaceProject.lamdaExpression;

public class LamdaDemoMain {

    public static void main(String[] args) {

        IGreeter iGreeter = (message) -> System.out.println(message);
        iGreeter.greetMessage("Welcome to learning course of java-8 features ");

        Ishape ishape = (x,y) -> System.out.println("area of rectangle: "+ x*y);
        ishape.area(10,20);

        Calculator calculator = (x,y,z) -> System.out.println("addition: "+ (x+y+z));
        calculator.add(34,67,89);


    }
}
