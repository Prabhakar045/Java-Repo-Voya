package com.voya.interfaceProject.defaultMethods;

import interExtend.ICalculator;

public class CalculatorImpl implements IBonusCalculator,IAllowanceCAlculator {
    @Override
    public void calculate(double amount) {
        System.out.println(amount*2);
    }


    @Override
    public void policyType() {
        System.out.println("policy type for all employees");
        IBonusCalculator.super.policyType();
        IAllowanceCAlculator.super.policyType();
    }
}
