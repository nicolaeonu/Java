package com.nicolae;

public class Main {

    public static void main(String[] args) {

        getLargestPrime(21);
    }

    public static void getLargestPrime(int number) {
        if (number < 0 || number == 0 || number == 1) {
            System.out.println("Parameter need to be greater then 0 ");
        }

        int largestPrime = -1;
        for (int i = 2; i <= number; i++) {

            boolean primeNumber = true; // assume i is a prime number
            if (number % i == 0) {
                // check if i is indeed a prime number
                for (int x = 2; x < i; x++) {
                    if (i % x == 0) {
                        primeNumber = false;
                    }
                }
                // Makes i the largest prime if current largest prime is smaller than i when i
                // is indeed a prime number.
                if (primeNumber && (largestPrime < i)) {
                    largestPrime = i;
                }
            }
        }
        System.out.println(largestPrime);
    }
}
