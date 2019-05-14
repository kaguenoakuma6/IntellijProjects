package com.intellij.main;

public class palindromo
{
    public static void pal()
    {
        String palabra  =  "Anita lava la tina", aux = "";
        int b = 0;

        b = palabra.length();

        for ( int c = b-1;  c >= 0; c--)
        {
            aux += palabra.substring(c,c+1);
        }
        //aux.toLowerCase();
        //a.toLowerCase();

        System.out.println("Palabra original: " + palabra.toLowerCase() + "\n");
        System.out.println("Palabra invertida: " + aux.toLowerCase() + "\n");

        if ( aux.toLowerCase().equals(palabra.toLowerCase()) )
        {
            System.out.println("palindromo");
        }
        else
        {
            System.out.println("otro tipo de palabra");
        }
    }

/**/



}
