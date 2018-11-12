package com.nicolae;

public class Main {

    public static void main(String[] args) {

        hasEqualSum(2,2,4);
    }

    public static void hasEqualSum(int firstNumber, int secondNumber, int thirdNumber){
        if((firstNumber + secondNumber)==thirdNumber){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
