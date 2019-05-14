package com.intellij.CodingExercises;

public class PerfectNumber
{
    public static void main(String[] args)
    {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }

    public static boolean isPerfectNumber(int number)
    {
        boolean isPerfect = false;
        int a = 1, sum = 0;

        if (number > 0)
        {
            while (a < number)
            {
                if (number % a == 0)
                {
                    sum += a;
                }
                a++;
            }

            if (number == sum )
            {
                isPerfect = true ;
            }

            return isPerfect;
        }
        else
        {
            return false;
        }
    }
}
