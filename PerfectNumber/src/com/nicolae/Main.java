package com.nicolae;

public class Main {

    public static void main(String[] args) {

        isPerfectNumber(6);
    }

    public static void isPerfectNumber(int number){
        int sum = 0;
        if(number < 1){
            System.out.println("Invalid Number");
        }else {
            for (int i = 1; i < number; i++) {

                if (number % i == 0) {
                    sum += i;
                }
            }
            if (sum == number) {
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        }
    }

}
