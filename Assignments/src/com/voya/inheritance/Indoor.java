package com.voya.inheritance;

public class Indoor extends Sports{

    @Override
    String[] showTypes(){
        return new String[]{"chess","Table Tennis","Carrom"};
    }
}
