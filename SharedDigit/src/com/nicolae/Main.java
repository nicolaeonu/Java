package com.nicolae;

public class Main {

    public static void main(String[] args) {

        hasSharedDigit(4,44);
    }

    public static void hasSharedDigit(int number1, int number2){
        if((number1 < 10 || number1 > 99) || (number2 <10|| number2 >99)){
            System.out.println("The number needs to be within the range of 10(inclusive) & 99(inclusive)");
        }else {

            int firstDigit1 = number1;
            int firstDigit2 = number2;

            while (((firstDigit1 >= 10) && (firstDigit1 <= 99)) && ((firstDigit2 >= 10) && firstDigit2 <= 99)) {

                firstDigit1 = number1 / 10;
                int lastDigit1 = number1 % 10;

                firstDigit2 = number2 / 10;
                int lastDigit2 = number2 % 10;


                if ((firstDigit1 == firstDigit2) || (firstDigit1 == lastDigit2) || (lastDigit1 == firstDigit2) || (lastDigit1 == lastDigit2)) {
                    System.out.println("true");
                }else {
                    System.out.println("false");
                }

            }
        }
    }

}
