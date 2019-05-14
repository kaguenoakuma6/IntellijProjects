package com.intellij.CodingExercises;

import java.util.Locale;
import java.util.Scanner;

public class ReadingUserInputChallenge
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        boolean read = true;

        int sum = 0, count = 1;

        while (read)
        {
            System.out.print("Enter number #" + count + ": ");

            if (scanner.hasNextInt())
            {
                sum += scanner.nextInt();

                if (count == 10)
                {
                    read = false;
                }
                count ++;
            }
            else
            {
                System.out.println("Invalid Value" );
            }
            scanner.nextLine();
        }

        System.out.println("La suma de los numeros es: " + sum);
        scanner.close();

    }
}
