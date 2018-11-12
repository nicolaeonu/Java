package com.nicolae;

public class Main {

    public static void main(String[] args) {

        sumOdd(1,7);
    }

    public static boolean isOdd(int number){
        if(number <= 0){
            return false;
        }else if(number % 2 != 0){
            System.out.println("Number " + number + " its odd" );
            return true;
        }else{
            System.out.println("Number " + number + " its not odd" );
            return false;
        }
    }
    public static int sumOdd(int start, int end){
        int sum = 0;
        if(((start > 0)&&(end >0)&&(end >= start))) {
            for (int i = start; i < end + 1; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            }
        }else{
            System.out.println("Invalid Number");
            return -1;
        }
        System.out.println(sum);
        return sum;
    }
}
