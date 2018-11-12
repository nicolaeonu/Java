package com.nicolae;

public class Main {

    public static void main(String[] args) {

        sumFirstAndLastDigit(22);
    }

    public static void sumFirstAndLastDigit (int number){
        if(number <0){
            System.out.println("Parameter needs to be positive");
        }else {
            int lastDigit = number % 10;
            int firstDdigit = 0;

            while (number > 0) {
                firstDdigit = number % 10;
                number /= 10;
            }
            System.out.println(lastDigit + firstDdigit);
        }
    }


}
