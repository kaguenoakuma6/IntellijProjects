package com.intellij.CompositionChalenge;

public class Lamp
{
    private String style;
    private boolean baterry;
    private int globalRating;

    public Lamp(String style, boolean baterry, int globalRating)
    {
        this.style = style;
        this.baterry = baterry;
        this.globalRating = globalRating;
    }

    public void turnOn()
    {
        System.out.println("Lamp -> Turning On");
    }

    public void turnOff()
    {
        System.out.println("Lamp -> Turning Off" );
    }

    public String getStyle()
    {
        return style;
    }

    public boolean isBaterry()
    {
        return baterry;
    }

    public int getGlobalRating()
    {
        return globalRating;
    }
}
