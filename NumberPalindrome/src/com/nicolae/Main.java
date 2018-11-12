package com.nicolae;

public class Main {

    public static void main(String[] args) {

        isPalindrome(7);
    }

    public static void isPalindrome(int number){
        int origNum = number;
        int reverse = 0;
        while(number != 0) {
            int lastDigit = number % 10;
            number /= 10;
            reverse += lastDigit;
            reverse *= 10;
        }
        if(reverse/10 == origNum){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
