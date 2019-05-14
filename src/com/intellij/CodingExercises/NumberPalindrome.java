package com.intellij.CodingExercises;

public class NumberPalindrome
{
    public static void main(String[] args)
    {
        /*System.out.println(reverseNumber(125));
        System.out.println(reverseNumber(-125));
        System.out.println(reverseNumber(9));
        System.out.println(reverseNumber(123456789));*/

        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
        System.out.println(isPalindrome(12321));
        System.out.println(isPalindrome(1001) );
        System.out.println(isPalindrome(11));


    }

    public static boolean isPalindrome( int number )
    {
        int reverse = 0;
        if ( number < 0 )
        {
            reverse = reverseNumber(number * -1 );
            reverse *= -1;
        }
        else
        {
            reverse = reverseNumber(number);
        }

        if (reverse == number )
            return true;
        else
            return false;
    }

    public static int reverseNumber(int number)
    {
        int reverse = 0;

        while ( number > 0 )
        {
            int digito = number % 10;

            reverse *= 10;
            reverse += digito;
            number /= 10;
        }

        return reverse;
    }
}
