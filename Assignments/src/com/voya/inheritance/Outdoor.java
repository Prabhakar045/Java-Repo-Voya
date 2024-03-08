package com.voya.inheritance;

public class Outdoor extends Sports{

    @Override
    String[] showTypes(){

        return new String[]{"chess","Table Tennis","Carrom"};
    }
}
