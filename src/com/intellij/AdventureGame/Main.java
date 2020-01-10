package com.intellij.AdventureGame;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main
{
    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        locations.put(0, new Location(0, "Estas sentado frente a una computadora aprendiendo Java"));
        locations.put(1, new Location(1, "Estas al final del camino ante una pequeña construcción"));
        locations.put(2, new Location(2, "Estas en la cima de una pequeña colina"));
        locations.put(3, new Location(3, "Estas dentro de un edificio, una buena casa para un buen descanso"));
        locations.put(4, new Location(4, "Estas en un valle al lado de un arroyo"));
        locations.put(5, new Location(5, "Estas en el bosque"));
        //locations.put(0, new Location(0, "Estas sentado frente a una computadora aprendiendo Java"));
        //locations.put(0, new Location(0, "Estas sentado frente a una computadora aprendiendo Java"));

        int loc = 1;

        while(true)
        {
            System.out.println(locations.get(loc).getDescription());

            if ( loc == 0 )
            {
                break;
            }

            loc = scanner.nextInt();

            if (!locations.containsKey(loc))
            {
                System.out.println("No puedes ir en esa dirección");
            }
        }
    }
}
