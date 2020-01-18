package com.intellij.SetAndHashSet;

import java.util.HashSet;
import java.util.Set;

public final class HeavenlyBody
{
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;
    public final BodyTypes bodyType;

    public enum BodyTypes
    {
        STAR,
        PLANET,
        DWARF_PLANET,
        MOON,
        COMET,
        ASTEROID
    }

    public HeavenlyBody(String name, double orbitalPeriod, BodyTypes bodyType)
    {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
        this.bodyType = bodyType;
    }

    public String getName()
    {
        return name;
    }

    public BodyTypes getBodyType()
    {
        return bodyType;
    }

    public double getOrbitalPeriod()
    {
        return orbitalPeriod;
    }

    public boolean addMoon(HeavenlyBody moon)
    {
        if(moon.getBodyType() == BodyTypes.MOON)
        {
            return this.satellites.add(moon);
        }
        else
        {
            return false;
        }
    }

    public Set<HeavenlyBody> getSatellites()
    {
        return new HashSet<>(this.satellites);
    }



    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }

        System.out.println();
        return super.equals(obj);
    }

    @Override
    public int hashCode()
    {
        return super.hashCode();
    }
}
