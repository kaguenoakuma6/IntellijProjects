package com.intellij.challenge;

public class Car extends Vehicle
{
    private int wheel, doors, windows, currentGear;
    private boolean fuel, lights, mirrors, isManual;

    public Car(String name, String size, int wheel, int doors, int windows, boolean isManual) {
        super(name, size);
        this.wheel = wheel;
        this.doors = doors;
        this.windows = windows;
        this.currentGear = 1;
        this.fuel = true;
        this.lights = true;
        this.mirrors = true;
        this.isManual = isManual;
    }

    public void changeGear(int currentGear)
    {
        this.currentGear = currentGear;

        System.out.println("Car.changeGear(): Changed to " + this.currentGear + " gear  ");
    }

    public void changeVelocity(int speed, int direction)
    {
        System.out.println("Car.ChangeVelocity(): Velocity " + speed + " direction " + direction);

        move(speed,direction);
    }
}
