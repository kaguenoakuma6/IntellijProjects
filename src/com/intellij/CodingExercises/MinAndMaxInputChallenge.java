package com.intellij.CodingExercises;

import java.util.Locale;
import java.util.Scanner;

public class MinAndMaxInputChallenge
{
    public static void main(String[] args)
    {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, cont = 0;
        Scanner scanner =  new Scanner(System.in).useLocale(Locale.US );

        while (true)
        {
            System.out.print("Teclea un numero: ");

            if (scanner.hasNextInt())
            {
                cont = scanner.nextInt();

                if (min > cont)
                {
                    min = cont;
                }

                if (max < cont)
                {
                    max = cont;
                }
            }
            else
            {
                break;
            }

            scanner.nextLine();
        }



        System.out.println("Max: " + max + " \nMin: " + min);
    }
}
