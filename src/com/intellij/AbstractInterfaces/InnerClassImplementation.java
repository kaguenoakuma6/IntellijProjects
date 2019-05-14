package com.intellij.AbstractInterfaces;

public class InnerClassImplementation
{
    public static void main(String[] args)
    {
        Gearbox mcLaren = new Gearbox(7);
       //Gearbox.Gear first = mcLaren.new Gear(1, 12.3);
        //Gearbox.Gear second = new Gearbox.Gear(2,16.1); // no es la apropiada generacion de una instancia de la clase gear
        //Gearbox.Gear second = new mcLaren.Gear(3,20.3); // no es la apropiada generacion de una instancia de la clase gear

       // System.out.println(first.driveSpeed(1000));
    }
}
