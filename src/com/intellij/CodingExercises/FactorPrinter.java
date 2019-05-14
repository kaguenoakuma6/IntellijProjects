package com.intellij.CodingExercises;

public class FactorPrinter
{
    public static void main(String[] args)
    {
        printFactors(6);
        printFactors(32);
        printFactors(10);
        printFactors(-6);
    }

    public static void printFactors(int number)
    {
        if ( number > 0 )
        {
            int a = 1;
            while ( a <= number)
            {
                if (number % a == 0)
                {
                    System.out.println(a );
                }
                a++;
            }
        }
        else
        {
            System.out.println("Invalid Value");
        }
    }
}
