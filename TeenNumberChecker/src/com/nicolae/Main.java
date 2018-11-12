package com.nicolae;

public class Main {

    public static void main(String[] args) {

        hasTeen(4,15,200);
    }

    public static void hasTeen(int firstNum, int secondNum, int thirdNum){

        if((firstNum >=13) && (firstNum <= 19)){
            System.out.println("true");
        }else if((secondNum >=13) && (secondNum <= 19)) {
            System.out.println("true");
        }else if((thirdNum >=13) && (thirdNum<= 19)) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
