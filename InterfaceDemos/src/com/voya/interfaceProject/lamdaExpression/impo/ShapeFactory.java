package com.voya.interfaceProject.lamdaExpression.impo;

public class ShapeFactory {

    void printArea(Ishape1 shape, int x, int y){
        System.out.println("Printing area: ");
        shape.area(10,20);
        System.out.println("completed");
    }
}
