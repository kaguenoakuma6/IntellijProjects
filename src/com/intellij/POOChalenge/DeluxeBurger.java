package com.intellij.POOChalenge;

public class DeluxeBurger extends Hamburger
{

    public DeluxeBurger()
    {
        super("Deluxe Burger", "Sausage & Bacon", "white", 14.54);
        super.addAddition1("chips", 2.75);
        super.addAddition2("Drink", 1.81);

    }

    @Override
    public void addAddition1(String name, double price)
    {
        System.out.println("Cannot add Additional Item for Deluxe Burger");
    }

    @Override
    public void addAddition2(String name, double price)
    {
        System.out.println("Cannot add Additional Item for Deluxe Burger") ;
    }

    @Override
    public void addAddition3(String name, double price)
    {
        System.out.println("Cannot add Additional Item for Deluxe Burger");
    }

    @Override
    public void addAddition4(String name, double price)
    {
        System.out.println("Cannot add Additional Item for Deluxe Burger");
    }


}
