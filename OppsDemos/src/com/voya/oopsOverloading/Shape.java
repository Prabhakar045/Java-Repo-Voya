package com.voya.oopsOverloading;

public class Shape {

    void calArea(int length){
        System.out.println("Area of square: "+length*length);
    }

    int calArea(int length , int beadth){
        System.out.println("area of rectangle: "+length*beadth);
        return 0;
    }

    void calArea(double radius){
        System.out.println("Area of circle: "+Math.PI*Math.pow(radius,2));
    }

    double calArea(double base, int height){

        return 0.5*base*height;
    }



}
