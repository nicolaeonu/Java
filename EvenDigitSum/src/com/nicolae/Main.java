package com.nicolae;

public class Main {

    public static void main(String[] args) {

        getEvenDigitSum(27234);
    }

    public static void getEvenDigitSum(int number) {
        int sum = 0;
        int digit = 0;

        if (number < 0) {
            System.out.println("Parameter needs to be positive");
        }else{
            while (number != 0) {
                digit = number % 10;
                number /= 10;

                if (digit % 2 == 0)
                    sum += digit;
            }

            System.out.println(sum);
        }
    }

}
