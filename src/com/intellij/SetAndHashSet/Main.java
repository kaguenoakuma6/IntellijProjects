package com.intellij.SetAndHashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main
{
    private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();


    public static void main(String[] args)
    {
        HeavenlyBody temp = new HeavenlyBody("Mercury", 88);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Venus", 225);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Earth", 356);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Moon", 27);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Mars", 687);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Deimos", 1.3);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Phobos", 0.3);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Jupiter", 4332);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Io", 1.8);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Moon", 27);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Venus", 225);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Earth", 356);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Moon", 27);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);


    }
}
