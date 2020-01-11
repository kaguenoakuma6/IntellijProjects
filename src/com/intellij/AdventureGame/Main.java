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

        Map<String, Integer> tempExits = new HashMap<String, Integer>();

        locations.put(0, new Location(0, "Estas sentado frente a una computadora aprendiendo Java" ,tempExits));
        
        tempExits = new HashMap<String, Integer>();
        tempExits.put("W",2);
        tempExits.put("E", 3);
        tempExits.put("S", 4);
        tempExits.put("N", 5);
        tempExits.put("Q", 0);
        locations.put(1, new Location(1, "Estas al final del camino ante una pequeña construcción" ,tempExits));
        
        tempExits = new HashMap<String, Integer>();
        tempExits.put("N", 5);
        tempExits.put("Q", 0);
        locations.put(2, new Location(2, "Estas en la cima de una pequeña colina" ,tempExits));

        tempExits = new HashMap<String, Integer>();
        tempExits.put("W", 1);
        tempExits.put("Q", 0);
        locations.put(3, new Location(3, "Estas dentro de un edificio, una buena casa para un buen descanso" ,tempExits));

        tempExits = new HashMap<String, Integer>();
        tempExits.put("N", 1);
        tempExits.put("W", 2);
        tempExits.put("Q", 0);
        locations.put(4, new Location(4, "Estas en un valle al lado de un arroyo" ,tempExits));

        tempExits = new HashMap<String, Integer>();
        tempExits.put("S", 1);
        tempExits.put("W", 2);
        tempExits.put("Q", 0);
        locations.put(5, new Location(5, "Estas en el bosque" ,tempExits));

        Map<String, String> palabras = new HashMap<String, String>();

        palabras.put("QUIT", "Q");
        palabras.put("NORTH", "N");
        palabras.put("SOUTH", "S");
        palabras.put("WEST", "W");
        palabras.put("EAST", "E");

        int loc = 1;

        while(true)
        {
            System.out.println(locations.get(loc).getDescription());

            tempExits.remove("S");
            if ( loc == 0 )
            {
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExits();

            System.out.println("Las alidas disponibles son ");

            for ( String exit : exits.keySet())
            {
                System.out.print(exit + ", ");
            }

            System.out.println();

            String direction = scanner.nextLine().toUpperCase();

            if (direction.length() > 1)
            {
                String[] entradas = direction.split(" ");
                for (String entrada : entradas)
                {
                    if(palabras.containsKey(entrada))
                    {
                        direction = palabras.get(entrada);
                        break;
                    }
                }
            }

            if (exits.containsKey(direction) )
            {
                loc = exits.get(direction);
            }
            else
            {
                System.out.println("No puedes ir en esa dirección");
            }
        }
    }
}
