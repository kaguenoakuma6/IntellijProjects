package com.intellij.Polymorphism;

class Car
{
    private boolean engine;
    private int weels, cylinders;
    private String name;

    public Car(int cylinders, String name)
    {
        this.cylinders = cylinders;
        this.name = name;
        this.weels = 4;
        this.engine = true;
    }

    public String startEngine()
    {
        return "No Start Engine";
    }

    public String accelerate()
    {
        return "No Accelerate";
    }

    public String Break()
    {
        return "Breaking car";
    }

    public int getCylinders()
    {
        return cylinders;
    }

    public String getName()
    {
        return name;
    }

    public boolean getEngine()
    {
        return engine;
    }

    public int getWeels()
    {
        return weels;
    }
}

class Charger extends Car
{
    public Charger()
    {
        super(4, "Charger");
    }

    @Override
    public String startEngine()
    {
        return "Start Engine Charger";
    }

    @Override
    public String accelerate()
    {
        return "Accelerate Charger";
    }

    @Override
    public String Break()
    {
        return "Charger is breaking";
    }
}
/**/
class Ferrari extends Car
{
    public Ferrari()
    {
        super(8, "Ferrari");
    }

    @Override
    public String startEngine()
    {
        return "Ferrari Engine Start";
    }

    @Override
    public String Break()
    {
        return "Ferrari Break";
    }
}

class Mercedes extends Car
{
    public Mercedes()
    {
        super(6, "Mercedes Benz");
    }

    @Override
    public String accelerate()
    {
        return "Mercedes is Accelerate";
    }

    @Override
    public String Break()
    {
        return "Mercedes is Break";
    }
}



public class Vehicle
{
    public static void main(String [] Args)
    {
        for (int a = 0;  a < 10; a++)
        {
            Car car = randCar();

            System.out.println("Car Name: " + car.getName() + "\nCar Cylinder: " + car.getCylinders() + "\nCar Wheels: " + car.getWeels() + "\nCar Engine: " + car.getEngine()
            + "\n" + car.startEngine() + "\n" + car.accelerate() + "\n" + car.Break() + "\n");
        }
    }

    public static Car randCar()
    {
        int rNum = (int) (Math.random() * 3 ) + 1;
        System.out.println("Generated Number: " + rNum);

        switch (rNum)
        {
            case 1:
                return new Charger();

            case 2:
                return new Ferrari();

            case 3:
                return new Mercedes();
        }
        return null;
    }
}
