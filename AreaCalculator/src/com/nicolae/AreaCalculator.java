package com.nicolae;

public class AreaCalculator {

    public static void area(double radius){
        if (radius <0){
            System.out.println("Parameter is negative");
        }else {
            double circleArea = radius * radius * 3.14159;
            System.out.println("Circle Area: " + circleArea);
        }
    }

    public static void area(double x, double y){
        if ((x <0)||(y<0)){
            System.out.println("Parameter is negative");
        }
        double rectangleArea = x * y;
        System.out.println("Rectangle Area: " + rectangleArea);
    }

}
