package com.voya.interfaceProject.lamdaExpression.impo;

public class ShapeMain {

    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        //create ref of Ishape
        Ishape1 shape1 = new Rectangle();

        shapeFactory.printArea(shape1,10,20);

        //using ananymous function
        shapeFactory.printArea(new Ishape1() {
            @Override
            public void area(int x, int y) {
                System.out.println("calculating area: ");
                System.out.println("Trianle: " +(x*y)/2);
            }
        },10,40);

        System.out.println("\n");
        /*
        ShapeFactory shapeFactory1 = (x,y) -> {
            System.out.println("calc sq area: ");
            System.out.println("square:" + (x*y));
        };
        shapeFactory1.printArea(shape1,2,2);

         */
    }
}
