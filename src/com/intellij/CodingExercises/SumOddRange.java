package com.intellij.CodingExercises;

public class SumOddRange
{

    public static void main(String[] args)
    {
        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(1, -100));
        System.out.println(sumOdd(100, 1000));
    }

    public static int sumOdd( int start, int end )
    {
        int suma = 0;
        if ( (end >= start ) && ( end > 0 && start > 0))
        {
            for (int a = start; a <= end; a++)
            {
                if (isOdd(a))
                {
                    suma += a;
                }
            }
            return suma;
        }
        else
        {
            return -1;
        }

    }

    public static boolean isOdd( int number )
    {
        if (number < 1 )
        {
            return false;
        }
        else
        {
            if (number % 2 != 0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }
}
