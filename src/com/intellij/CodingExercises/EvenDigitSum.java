package com.intellij.CodingExercises;

public class EvenDigitSum
{
    public static void main(String[] args)
    {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252) );
        System.out.println(getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(int number)
    {
        int suma = 0;

        if (number < 0 )
        {
            return -1;
        }
        else
        {
            int digit = 0;

            while ( number > 0 )
            {
                digit = number % 10;
                number /= 10;

                if (digit % 2 == 0 )
                {
                    suma += digit;
                }
            }
        }

        return suma;
    }
}
