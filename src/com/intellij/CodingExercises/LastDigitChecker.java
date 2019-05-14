package com.intellij.CodingExercises;

public class LastDigitChecker
{
    public static void main(String[] args)
    {
        System.out.println(hasSameLastDigit(41,22,71));
        System.out.println(hasSameLastDigit(23,32,42));
        System.out.println(hasSameLastDigit(9,99,999));
        System.out.println(hasSameLastDigit(22,23,34));
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3)
    {
        boolean rett = false;
        if( num1 >= 10 && num1 <= 1000 && num2 >= 10 && num2 <= 1000 && num3 >= 10 && num3 <= 1000 )
        {
            int digit1 = 0, digit2 = 0, digit3 = 0;

            digit1 = num1 % 10;
            digit2 = num2 % 10;
            digit3 = num3 % 10;

            if (digit1 == digit2 || digit1 == digit3 || digit2 == digit3 )
            {
                rett = true;
            }
            return rett;
        }
        else
        {
            return false;
        }
    }
}
