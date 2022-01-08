package com.calculatorapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

import java.util.ArrayList;

public class Controller {
    private static ArrayList<Double> nums = new ArrayList<Double>();
    private static ArrayList<Character> operations = new ArrayList<Character>();
    private static double currentNum = 0;
    private static boolean decimal = false;
    private static double decimalPlace = 10;

    @FXML
    private Text calcText;

    @FXML
    void btn0Clicked(ActionEvent event) {
        if(!decimal) {
            currentNum = (currentNum * 10);
        }
        else {
            currentNum += 0/decimalPlace;
            decimalPlace *= 10;
        }

        calcText.setText(String.valueOf(currentNum));
    }

    @FXML
    void btn1Clicked(ActionEvent event) {
        if(!decimal) {
            currentNum = (currentNum * 10 + 1);
        }

        else {
            currentNum += (1.0/decimalPlace );
            decimalPlace *= 10;
        }
        calcText.setText(String.valueOf(currentNum));
    }

    @FXML
    void btn2Clicked(ActionEvent event) {
        if(!decimal) {
            currentNum = (currentNum * 10 + 2);
        }

        else {
            currentNum += (2.0/decimalPlace );
            decimalPlace *= 10;
        }

        calcText.setText(String.valueOf(currentNum));
    }

    @FXML
    void btn3Clicked(ActionEvent event) {
        if(!decimal) {
            currentNum = (currentNum * 10 + 3);
        }

        else {
            currentNum += (3.0/decimalPlace );
            decimalPlace *= 10;
        }

        calcText.setText(String.valueOf(currentNum));
    }

    @FXML
    void btn4Clicked(ActionEvent event) {
        if(!decimal) {
            currentNum = (currentNum * 10 + 4);
        }

        else {
            currentNum += (4.0/decimalPlace );
            decimalPlace *= 10;
        }

        calcText.setText(String.valueOf(currentNum));
    }

    @FXML
    void btn5Clicked(ActionEvent event) {
        if(!decimal) {
            currentNum = (currentNum * 10 + 5);
        }

        else {
            currentNum += (5.0/decimalPlace );
            decimalPlace *= 10;
        }

        calcText.setText(String.valueOf(currentNum));
    }

    @FXML
    void btn6Clicked(ActionEvent event) {
        if(!decimal) {
            currentNum = (currentNum * 10 + 6);
        }

        else {
            currentNum += (6.0/decimalPlace );
            decimalPlace *= 10;
        }

        calcText.setText(String.valueOf(currentNum));
    }

    @FXML
    void btn7Clicked(ActionEvent event) {
        if(!decimal) {
            currentNum = (currentNum * 10 + 7);
        }

        else {
            currentNum += (7.0/decimalPlace );
            decimalPlace *= 10;
        }
        calcText.setText(String.valueOf(currentNum));
    }

    @FXML
    void btn8Clicked(ActionEvent event) {
        if(!decimal) {
            currentNum = (currentNum * 10 + 8);
        }

        else {
            currentNum += (8.0/decimalPlace );
            decimalPlace *= 10;
        }
        calcText.setText(String.valueOf(currentNum));
    }

    @FXML
    void btn9Clicked(ActionEvent event) {
        if(!decimal) {
            currentNum = (currentNum * 10 + 9);
        }

        else {
            currentNum += (1.0/decimalPlace );
            decimalPlace *= 10;
        }

        calcText.setText(String.valueOf(currentNum));
    }

    @FXML
    void btnClearClicked(ActionEvent event) {
        currentNum = 0;
        nums.clear();
        decimal = false;
        decimalPlace = 10;
        operations.clear();
        calcText.setText("0");
    }

    @FXML
    void btnDecimalClicked(ActionEvent event) {
        decimal = true;
    }

    @FXML
    void btnDivideClicked(ActionEvent event) {
        addNum(currentNum);
        currentNum = 0;
        decimal = false;
        decimalPlace = 10;
        addOperation('/');
    }

    @FXML
    void btnEqualsClicked(ActionEvent event) {
        addNum(currentNum);
        double soln = calculate();
        decimal = false;
        decimalPlace = 10;
        nums.clear();
        operations.clear();
        currentNum = soln;
        calcText.setText(String.valueOf(soln));
    }

    @FXML
    void btnMinusClicked(ActionEvent event) {
        addNum(currentNum);
        currentNum = 0;
        decimal = false;
        decimalPlace = 10;
        addOperation('-');
    }

    @FXML
    void btnPlusClicked(ActionEvent event) {
        addNum(currentNum);
        currentNum = 0;
        decimal = false;
        decimalPlace = 10;
        addOperation('+');
    }

    @FXML
    void btnPowerClicked(ActionEvent event) {
        addNum(currentNum);
        currentNum = 0;
        decimal = false;
        decimalPlace = 10;
        addOperation('^');
    }

    @FXML
    void btnSqrtClicked(ActionEvent event) {
        addNum(currentNum);
        currentNum = 0;
        decimal = false;
        decimalPlace = 10;
        addOperation('s');
    }

    @FXML
    void btnMultiplyClicked(ActionEvent event) {
        addNum(currentNum);
        currentNum = 0;
        decimal = false;
        decimalPlace = 10;
        addOperation('*');
    }

    public void addNum(double numIn) {
        nums.add(numIn);
    }

    public void addOperation(char operationIn){
        operations.add(operationIn);
    }

    public double calculate() {
        System.out.println(nums.toString());
        System.out.println(operations.toString());

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
                case '*':
                    soln = firstNum * secondNum;
                    break;
                case '/':
                    soln = firstNum / secondNum;
                    break;
                case '^':
                    soln = Math.pow(firstNum, secondNum);
                    break;
                case 's':
                    soln = Math.sqrt(firstNum);
                    break;
            }

            firstNum = soln;
        }
        System.out.println(soln);
        return soln;
    }


}
