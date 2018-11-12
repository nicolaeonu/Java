package com.nicolae;

public class Main {

    public static void main(String[] args) {

        printYearsAndDays(1020457);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");

        } else if (minutes >= 0) {

            long year = (minutes / 60) / 24 / 365;
            long days = (minutes / 60) / 24;
            long remainingDays = (days % 365);
            System.out.println(minutes + " min = " + year + " y" + " and " + remainingDays + " d");
        }

    }
}
