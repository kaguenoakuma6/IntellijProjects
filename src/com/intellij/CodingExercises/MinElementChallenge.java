package com.intellij.CodingExercises;

import java.util.Locale;
import java.util.Scanner;

public class MinElementChallenge
{
    public static Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args)
    {
        int count = 0, min = 0;

        System.out.print("Ingresa el numero de elementos del array: " );
        count = scanner.nextInt();
        scanner.nextLine();

        int ArrayValue [] = readIntegers(count);

        min = findMin(ArrayValue);

        System.out.println("El Valor minimo es: " + min);

    }

    public static int[] readIntegers(int count)
    {
        int array[] = new int[count], cont = 0;

        while (cont < count)
        {
            System.out.print("Ingresa un Numero: ");

            if (scanner.hasNextInt())
            {
                array[cont] = scanner.nextInt();
                cont ++;
            }

            scanner.nextLine();
        }

        return array;
    }

    public static int findMin(int[] array)
    {
        int min = Integer.MAX_VALUE, cont = 0;

        for (int a : array)
        {
            if (min > a )
            {
                min = a;
            }
        }

        return min;
    }
}
