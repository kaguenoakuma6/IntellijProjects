package com.intellij.CodingExercises;

public class NumberToWords
{
    public static void main(String[] args)
    {
        System.out.println(getDigitCount(10));
        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(5));
        System.out.println(getDigitCount(1234589));

        System.out.println(reverse(-2));
        System.out.println(reverse(-508));


        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
    }

    public static void numberToWords(int number)
    {
        if (number < 0)
        {
            System.out.println("Invalid Value");
        }
        else
        {
            int reversed = 0, lengNum = 0, lengReversed = 0;
            reversed = reverse(number);
            String numberWord = "";
            lengNum = getDigitCount(number);
            lengReversed = getDigitCount(reversed);

            while ( reversed > 0 )
            {
                int digito = reversed % 10;

                switch (digito)
                {
                    case 0:
                        numberWord += "Zero";
                        break;

                    case 1:
                        numberWord += "One" ;
                        break;

                    case 2:
                        numberWord += "Two";
                        break;

                    case 3:
                        numberWord += "Three";
                        break;

                    case 4:
                        numberWord += "Four";
                        break;

                    case 5:
                        numberWord += "Five";
                        break;

                    case 6:
                        numberWord += "Six";
                        break;

                    case 7:
                        numberWord += "Seven";
                        break;

                    case 8:
                        numberWord += "Eight";
                        break;

                    case 9:
                        numberWord += "Nine";
                        break;
                }
                reversed /= 10;
                numberWord += " ";
            }

            if (lengNum > lengReversed)
            {
                for (int a = 0; a < lengNum - lengReversed; a++)
                {
                    numberWord += "Zero ";
                }
            }

            System.out.println(numberWord.trim());
        }
    }

    public static int reverse(int number)
    {
        int reverse = 0;

        if (number < 0 )
        {
            int tmp = number * -1;
            while ( tmp > 0 )
            {
                int digito = tmp % 10;

                reverse *= 10;
                reverse += digito;
                tmp /= 10;
            }
            reverse *= -1;
        }
        else
        {
            while ( number > 0 )
            {
                int digito = number % 10;

                reverse *= 10;
                reverse += digito;
                number /= 10;
            }
        }

        return reverse;
    }

    public static int getDigitCount (int number)
    {
        if (number < 0 )
        {
            return -1;
        } else if (number == 0)
        {
            return 1;
        } else
        {
            int digits = 0;

            while (number > 0)
            {
                digits++;
                number /= 10;
            }
            return digits;
        }
    }
}
