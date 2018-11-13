package com.nicolae;

public class Main {

    public static void main(String[] args) {

        LastDigitChecker.hasSameLastDigit(11,22,33);
    }
    
    public static void hasSameLastDigit(int num1,int num2,int num3)
    {
        if((num1<10)||(num1>1000)||(num2<10)||(num2>1000)||(num3<10)||(num3>1000))
        {
            System.out.println("The number is not inr the range of 10-1000");
        }
        else
        {
            num1 %= 10;
            num2=num2%10;
            num3=num3%10;
            if((num1==num2)||(num2==num3)||(num1==num3))
            {
                System.out.println("true");
            }
            else
                System.out.println("false");
        }
    }
    
}
