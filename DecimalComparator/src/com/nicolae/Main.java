package com.nicolae;

public class Main {

    public static void main(String[] args) {

        areEqualByThreeDecimalPlaces(20.00,20);
    }

    public static void areEqualByThreeDecimalPlaces(double firstNumber,double secondNumber ){
        int castingToIntFirstNumber = (int)(firstNumber *1000);
        int castingToIntSecondNumber = (int)(secondNumber *1000);

        if (castingToIntFirstNumber == castingToIntSecondNumber){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
