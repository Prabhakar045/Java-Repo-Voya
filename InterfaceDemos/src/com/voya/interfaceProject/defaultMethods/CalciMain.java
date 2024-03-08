package com.voya.interfaceProject.defaultMethods;

public class CalciMain {

    public static void main(String[] args) {
        IBonusCalculator iBonusCalculator = new CalculatorImpl();
        iBonusCalculator.calculate(5000.0);

        IAllowanceCAlculator allowanceCAlculator= (IAllowanceCAlculator) iBonusCalculator;
        allowanceCAlculator.calculate(1000.0);
        allowanceCAlculator.policyType();


    }
}
