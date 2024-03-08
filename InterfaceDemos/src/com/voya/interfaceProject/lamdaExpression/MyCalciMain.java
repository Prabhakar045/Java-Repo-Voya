package com.voya.interfaceProject.lamdaExpression;

public class MyCalciMain {
    public static void main(String[] args) {

        IMyCalculator iMyCalculator = (a, b) -> {
            int sum = a+b;
            return sum;
        };
         iMyCalculator.calculate(13,12);

         iMyCalculator = (x,y) -> x*y;
         int mul =  iMyCalculator.calculate(3,6);


        System.out.println(mul);
    }
}
