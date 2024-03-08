package com.voya.interfaceProject.lamdaExpression;

public class GreeterMain {

    public static void main(String[] args) {
        IGreeter greeter = new GreeterImpl();
        greeter.greetMessage("Welcome to learning course of java-8 features");

        IGreeter greeter1 = new IGreeter(){

            @Override
          public void greetMessage(String message){
                System.out.println(message);
            }
        };
        greeter1.greetMessage("Welcome lamda 8");


    }
}
