package com.intellij.CodingExercises;

public class SumDigits
{
    public static void main(String[] args)
    {
        System.out.println(sumDigits(125));
    }

    public static int sumDigits( int numero )
    {
        if ( numero < 10 )
        {
            return -1;
        }
        else
        {
            int suma = 0;
            while ( numero > 0 )
            {
                int digito = numero % 10;

                suma += digito;

                numero /= 10;
            }
            return suma;
        }
    }
}
