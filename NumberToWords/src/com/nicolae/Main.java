package com.nicolae;

public class Main {

    public static void main(String[] args) {

        numberToWords(458965);
    }

    public static void numberToWords(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
            return;
        }

        int initialCount = getDigitCount(number);
        int reversedNum = reverse(number);
        int newCount = getDigitCount(reversedNum);
        int lastDigit;

        while (reversedNum > 0) {
            lastDigit = reversedNum % 10;
            switch (lastDigit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }

            reversedNum /= 10;
        }

        if (initialCount != newCount) {
            int countDiff = initialCount - newCount;
            while (countDiff > 0) {
                System.out.println("Zero");
                countDiff--;
            }
        }
    }

    public static int getDigitCount(int number) {
        int count = 0;
        if (number < 0) {
            return -1;
        } else if (number == 0) {
            count = 1;
        } else {
            while (number > 0) {
                number /= 10;
                count++;
            }
        }

        return count;
    }

    public static int reverse(int number) {
        int reversedNum = 0;
        if (number < 0) {
            number *= -1;
            while (number > 0) {
                reversedNum = (reversedNum * 10) + (number % 10);
                number /= 10;
            }

            reversedNum *= -1;
        } else {
            while (number > 0) {
                reversedNum = (reversedNum * 10) + (number % 10);
                number /= 10;
            }
        }

        return reversedNum;
    }
}
