package com.voya.interfaceProject.lamdaExpression.impo;

public class Rectangle implements Ishape1 {


    @Override
    public void area(int x, int y) {
        System.out.println("Area of rect: "+ x*y);
    }
}
