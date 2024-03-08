package com.voya.interfaceProject.lamdaExpression;

@FunctionalInterface
public interface Ishape {

    void area(int x,int y);

    default void areaOfTraingle(int h, int b){

    }
}
