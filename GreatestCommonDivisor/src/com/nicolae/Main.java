package com.nicolae;

public class Main {

    public static void main(String[] args) {

        getGreatestCommonDivisor(12,30);
    }

    public static void getGreatestCommonDivisor(int first,int second){
        int gcd = 1;
        if(first < 10 || second <10){
            System.out.println("The number is not greater than 10(inclusive)");
        }
        for(int i = 1; i < first  || i < second ; i++){
            if(first % i == 0 && second % i == 0){
                gcd = i;
            }
        }
        System.out.println(gcd);
    }
}
