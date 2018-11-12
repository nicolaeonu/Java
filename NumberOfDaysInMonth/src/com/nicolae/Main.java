package com.nicolae;

public class Main {

    public static void main(String[] args) {

        getDaysInMonth(2,2018);
    }

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                return true;

            } else
                return false;
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year){
        int day;
        if((month < 1 || month >12) || (year < 1 || year > 9999)){
            System.out.println("Invalid number");
            return -1;
        }

        switch(month){

            case 2:
                if(isLeapYear(year)) {
                    day = 29;
                    System.out.println(day);
                }
                else
                    day = 28;
                System.out.println(day);
                break;

            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                day = 31;
                System.out.println(day);
                break;
            case 4: case 6: case 9: case 11:
                day = 30;
                System.out.println(day);
                break;

            default:
                return 0;
        }
        return day;
    }

}
