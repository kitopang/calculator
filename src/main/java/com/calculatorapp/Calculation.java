package com.calculatorapp;

import java.util.ArrayList;

public class Calculation {
    private ArrayList<Double> nums;
    private ArrayList<Character> operations;

    public Calculation() {
        nums = new ArrayList<Double>();
        operations = new ArrayList<Character>();
    }

    public void addNum(double numIn) {
        nums.add(numIn);
    }

    public void addOperation(char operationIn){
        operations.add(operationIn);
    }

    public double calculate() {
        double firstNum = nums.get(0);
        double secondNum = 0;
        double soln = 0;

        for(int i = 0; i < operations.size(); i++) {
            secondNum = nums.get(i + 1);

            switch(operations.get(i)) {
                case '+':
                    soln = firstNum + secondNum;
                    break;
                case '-':
                    soln = firstNum - secondNum;
                    break;
            }

            firstNum = soln;
        }

        return soln;
    }
}
