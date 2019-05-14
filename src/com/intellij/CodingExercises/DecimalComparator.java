package com.intellij.CodingExercises;

public class DecimalComparator
{
    public static void main(String[] args)
    {
        boolean res;
        res = areEqualByThreeDecimalPlaces(-3.1756 , -3.175 );
        System.out.println(res);

        res = areEqualByThreeDecimalPlaces(3.176 , 3.175 );
        System.out.println(res);

        res = areEqualByThreeDecimalPlaces(3.0 , 3.0);
        System.out.println(res);
    }

    public static boolean areEqualByThreeDecimalPlaces(double n1, double n2)
    {
        int v1 = (int) (n1 * 1000);
        int v2 = (int) (n2 * 1000);
        System.out.println(v1 + " : " + v2);

        if (v1 == v2 )
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
