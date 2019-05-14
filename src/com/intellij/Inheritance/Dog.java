package com.intellij.Inheritance;

public class Dog extends Animal
{
    // características especificas de los perros
    private int legs, eyes, tail, teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat)
    {
        // la directiva " super " se utiliza para acceder a los elementos de la clase principal o de la cual se están heredando características en este ejemplo elementos de la clase Animal
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew()
    {
        System.out.println("dog.chew() Called;" );
    }

    @Override
    public void eat()
    {
        System.out.println("Dog.eat() Called");
        chew();
        super.eat();
    }

    public void walk()
    {
        System.out.println("Dog.walk() Called");
        super.move(5);
    }

    public void run()
    {
        System.out.println("Dog.run() Called");
        move(10);
    }

    public void moveLegs()
    {
        System.out.println("Dog.moveLegs() Called");
    }

    @Override
    public void move(int speed)
    {
        System.out.println("Dog.move() Called");
        moveLegs();
        super.move(speed);
    }
}
