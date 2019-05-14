package com.intellij.CodingExercises;

public class IntEqualityPrinter
{
    public static void main(String[] args)
    {
       // printEqual(1, 1, 1);
        printEqual(1,1,1);
        printEqual(1,1,2);
        printEqual(-1,-1,-1);
        printEqual(1,2,3);
        printEqual(-1,1,1);
    }

    public static void printEqual(int num, int num2, int num3)
    {
        if (num >= 0 && num2 >= 0 && num3 >= 0 )
        {
            if (num == num2 && num2 == num3 )
            {
                System.out.println("All numbers are equal");
            }
            else if (num != num2 && num != num3 && num2 != num3)
            {
                System.out.println("All numbers are different");
            }
            else
            {
                System.out.println("Neither all are equal or different");
            }
        }
        else
        {
            System.out.println("Invalid Value");
        }
    }
}
