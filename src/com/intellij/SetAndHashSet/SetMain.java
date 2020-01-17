package com.intellij.SetAndHashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMain
{
    public static void main(String[] args)
    {
        Set<Integer> cuadrado = new HashSet<>();
        Set<Integer> cubo = new HashSet<>();

        for (int i = 1; i <= 100; i++)
        {
            cuadrado.add(i * i);
            cubo.add(i * i * i);
        }

        System.out.println("Hay " + cuadrado.size() + " cuadrados y " + cubo.size() + " cubos");
        Set<Integer> union = new HashSet<>(cuadrado);
        union.addAll(cubo);

        System.out.println("La union contiene: " + union.size() + " elementos");

        Set<Integer> interseccion = new HashSet<Integer>(cuadrado);
        interseccion.retainAll(cubo);

        System.out.println("La interseccion contiene: " + interseccion.size() + " elementos");

        for (int i : interseccion)
        {
            System.out.println(i + " es el cuadrado de: " + Math.sqrt(i) + " y el cubo de: " + Math.cbrt(i));
        }

        Set<String> palabras = new HashSet<>();
        String oracion = "un dia en el año del zorro";
        String[] arrayPalabras = oracion.split(" ");
        palabras.addAll(Arrays.asList(arrayPalabras));

        for (String p : palabras)
        {
            System.out.println(p);
        }

    }
}
