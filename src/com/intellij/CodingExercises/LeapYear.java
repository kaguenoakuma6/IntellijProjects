package com.intellij.CodingExercises;

public class LeapYear
{
    public static void main(String[] args)
    {
        System.out.println(isLeapYear(1924));
    }

    public static boolean isLeapYear ( int year )
    {
        if ( year > 0 && year < 10000)
        {
            if ( (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }

}
