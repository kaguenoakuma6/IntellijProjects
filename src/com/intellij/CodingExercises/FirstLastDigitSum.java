package com.intellij.CodingExercises;

public class FirstLastDigitSum
{
    public static void main(String[] args)
    {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-5));

    }

    public static int sumFirstAndLastDigit(int number)
    {
        if (number >= 0 )
        {
            int sum , first, last, ini, digit;
            sum = first = last = ini = digit = 0;

            while (number > 0)
            {
                digit = number % 10 ;

                if (ini == 0)
                {
                    first = digit;
                    ini = 1;
                }
                number/= 10;
            }

            last = digit;
            //System.out.println(last);
            sum = last + first;
            return sum;
        }
        else
        {
            return -1;
        }
    }
}
