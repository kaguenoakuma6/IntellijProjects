package com.intellij.CodingExercises;

public class MinutesToYearsDaysCalculator
{
    public static void main(String[] args)
    {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
        printYearsAndDays(-561600);
        printYearsAndDays(0);

    }

    public static void printYearsAndDays(long minutes)
    {
        int year = 0, day = 0,tmp = 0;

        if (minutes >= 0)
        {
            year = (int) (minutes) / (60*24*365);
            tmp = (int) (minutes) % (60*24*365);
            day = tmp / (60*24);

            System.out.println(minutes + " min = " + year + " y and " + day + " d" );
        }
        else
        {
            System.out.println("Invalid Value");
        }

    }
}
