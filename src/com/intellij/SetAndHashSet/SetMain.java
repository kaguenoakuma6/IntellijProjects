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

        Set<String> nature = new HashSet<>();
        Set<String> divine = new HashSet<>();

        String[] natureWords = {"all", "nature", "is", "but", "art", "unknown", "to", "thee"};
        nature.addAll(Arrays.asList(natureWords));

        String[] divineWords = {"to", "err", "is", "human", "to", "forgive", "divine"};
        divine.addAll(Arrays.asList(divineWords));

        System.out.println("nature - divine:");

        Set<String> diff1 = new HashSet<>(nature);
        diff1.removeAll(divine);

        printSet(diff1);

        System.out.println("divine - nature: ");

        Set<String> diff2 = new HashSet<>(divine);
        diff2.removeAll(nature);

        printSet(diff2);

        Set<String> unionTest = new HashSet<>(nature);
        unionTest.addAll(divine);

        Set<String> intersectionTest = new HashSet<>(nature);
        intersectionTest.retainAll(divine);

        System.out.println("Symmetric difference");
        unionTest.removeAll(intersectionTest);

        printSet(unionTest);

        if (nature.containsAll(divine))
        {
            System.out.println("divine es una subcoleccion de nature");
        }
        if (nature.containsAll(intersectionTest))
        {
            System.out.println("intersecionTest es una subcoleccion de nature");
        }

        if (divine.containsAll(intersectionTest))
        {
            System.out.println("intersecionTest es una subcoleccion de divine");
        }
    }

    private static void printSet(Set<String> set)
    {
        System.out.print("\t");

        for (String s : set)
        {
            System.out.print(s + " ");

        }
        System.out.println();
    }
}
