package com.intellij.CodingExercises;

public class Barking
{
    public static boolean bark(boolean barking, int hourOfDay)
    {
        if ( barking )
        {
            if ( hourOfDay >= 0 && hourOfDay <=23 )
            {
                if ( hourOfDay < 8 || hourOfDay > 22)
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
        else
        {
            return false;
        }
    }
}
