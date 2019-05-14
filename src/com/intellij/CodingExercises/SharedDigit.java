package com.intellij.CodingExercises;

public class SharedDigit
{
    public static void main(String[] args)
    {
        System.out.println(hasSharedDigit(12,23));
        System.out.println(hasSharedDigit(9,23));
        System.out.println(hasSharedDigit(15,55));
        System.out.println(hasSharedDigit(12,99));
    }

    public static boolean hasSharedDigit( int num1, int num2)
    {
        if ( ( num1 >= 10 && num1 <= 99 ) && ( num2 >= 10 && num2 <= 99 ) )
        {
            int digit1 = 0, digit2 = 0;
            boolean shared = false;

            while (num1 > 0)
            {
                digit1 = num1 % 10 ;
                num1 /= 10;

                while (num2 > 0 )
                {
                    digit2 = num2 % 10;
                    num2 /= 10;

                    if (digit1 == digit2)
                    {
                        shared = true;
                        break;
                    }
                }
            }
            return shared;
        }
        else
        {
            return false;
        }
    }
}
