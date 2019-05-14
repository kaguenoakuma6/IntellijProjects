package com.intellij.CodingExercises;

public class LargestPrime
{
    public static void main(String[] args)
    {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
    }

    public static int getLargestPrime(int number )
    {
        if (number > 1)
        {
            int i = 2, result = 0;

            while (number > 1)
            {
                if (number % i == 0)
                {
                    if (i > result)
                    {
                        result = i;
                    }

                    number /= i;
                    i = 1;
                }

                i++;

            }
            return result;
        }
        else
        {
            return -1;
        }
    }
}
