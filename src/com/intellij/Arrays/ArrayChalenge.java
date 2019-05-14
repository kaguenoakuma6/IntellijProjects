package com.intellij.Arrays;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class ArrayChalenge
{
    private static Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    public static void main(String [] Args)
    {
        int array[] = getValues(5);

        int[] sorted = sortArray(array);

        printArray(sorted);
    }

    public static int[] getValues(int leng)
    {
        int[] array = new int[leng];

        System.out.println("Ingresa " + leng + " numeros \n ");

        for ( int i = 0; i < array.length; i++)
        {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static void printArray (int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.println("Element " + i +  " Value " + array[i]);
        }
    }

    public static int[] sortArray(int[] array)
    {
        int[] sorted = Arrays.copyOf(array, array.length);
        //int[] sorted = new int[array.length];
        int temp;
        boolean flag = true;

        for (int i = 0; i < array.length; i++)
        {
            sorted[i] = array[i];
        }

        while (flag)
        {
            flag = false;

            for (int j = 0; j < sorted.length -1 ; j++)
            {
                if (sorted[j] < sorted[j + 1])
                {
                    temp = sorted[j];
                    sorted[j] = sorted[j + 1];
                    sorted[j + 1] = temp;
                    flag = true;
                }
            }
        }

        return sorted;
    }
}
