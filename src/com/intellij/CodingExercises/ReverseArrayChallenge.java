package com.intellij.CodingExercises;

import java.util.Arrays;

public class ReverseArrayChallenge
{
    public static void main(String[] args)
    {
        int [] array =  {1,2,3,4,5};

        System.out.println(Arrays.toString(array));

        System.out.println();

        reverse(array);

        System.out.println(Arrays.toString(array));
    }

    private static void reverse(int[] Array)
    {
        int tmp = 0, len = Array.length - 1, mid = Array.length / 2 ;

        for (int i = 0; i < mid; i++)
        {
            tmp = Array[i];
            Array[i] = Array[len - i];
            Array[len - i] = tmp;
        }

    }
}
