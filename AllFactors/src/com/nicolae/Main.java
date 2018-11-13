package com.nicolae;

public class Main {

    public static void main(String[] args) {

        printFactors(60);
    }

    public static void printFactors(int number) {
        int result = 0;
        if (number < 1) {
            System.out.println("Invalid Value");

        } else {
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        }
    }

}
