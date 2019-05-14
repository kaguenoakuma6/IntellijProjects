package com.intellij.CodingExercises;

public class OtherClass
{
    public static void main(String[] args)
    {
        System.out.println(isPalindrome(11));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(-1221));
    }

    public static boolean isPalindrome( int number )
    {
        int reverse = 0, tmp = 0;

        if ( number < 0 )
        {
            tmp = number * -1;

            while ( tmp > 0 )
            {
                int digito = tmp % 10;

                reverse *= 10;
                reverse += digito;
                tmp /= 10;
            }

            reverse *= -1;
        }
        else
        {
            tmp = number;
            while ( tmp > 0 )
            {
                int digito = tmp % 10 ;

                reverse *= 10;
                reverse += digito;
                tmp /= 10;
            }
        }

        if (reverse == number )
            return true;
        else
            return false;
    }
}
