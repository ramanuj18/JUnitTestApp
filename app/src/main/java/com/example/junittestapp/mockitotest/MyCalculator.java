package com.example.junittestapp.mockitotest;

public class MyCalculator {

    CalculatorService service;

    public MyCalculator(CalculatorService calculatorService){
        this.service=calculatorService;
    }

    public int perform(int i,int j){        //logic (i,j)*i
        return service.add(i,j)*i;
       // return (i+j)*i;
    }
}
