package com.voya.oopsOverloading;

public class ShapeMain {
    public static void main(String[] args) {
        Shape shape = new Shape();

        shape.calArea(20);
        shape.calArea(10.00);
       int ar = (int) shape.calArea(15.00,25);
        shape.calArea(10,20);

        System.out.println(ar);
    }
}
