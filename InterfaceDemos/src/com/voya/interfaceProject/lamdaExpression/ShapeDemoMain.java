package com.voya.interfaceProject.lamdaExpression;

public class ShapeDemoMain {
    public static void main(String[] args) {
        Ishape ishape = new Ishape(){

            @Override
            public void area(int x, int y) {
                System.out.println("area of rectangle: "+x*y);
            }

            @Override
            public void areaOfTraingle(int h, int b) {
                System.out.println("area of triangle: "+(b*h)/2);
            }
        };
        ishape.area(15,10);
        ishape.areaOfTraingle(5,6);
    }
}
