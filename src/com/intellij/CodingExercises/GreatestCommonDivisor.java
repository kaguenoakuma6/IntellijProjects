package com.intellij.CodingExercises;

public class GreatestCommonDivisor
{
    public static void main(String[] args)
    {
        System.out.println(getGreatestCommonDivisor(25,15));
        System.out.println(getGreatestCommonDivisor(12,30));
        System.out.println(getGreatestCommonDivisor(9,18));
        System.out.println(getGreatestCommonDivisor(81,153));
    }

    public static int getGreatestCommonDivisor(int first, int second)
    {
        if (first >= 10 && second >= 10)
        {
            int maxDivisor = 0, control = 0, a = 1;

            if ( first <= second )
            {
                control = first;
            }
            else
            {
                control = second;
            }

            while ( a <= control )
            {
                if ( ( first % a == 0 ) && ( second % a == 0 ))
                {
                    maxDivisor = a;
                }
                a++;
            }

            return maxDivisor;
        }
        else
        {
            return -1;
        }
    }
}
