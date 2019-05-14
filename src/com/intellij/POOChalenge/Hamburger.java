package com.intellij.POOChalenge;

public class Hamburger
{
    private String name, meat, breadRoll;
    private double price;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, String breadRoll, double price )
    {
        this.name = name;
        this.meat = meat;
        this.breadRoll = breadRoll;
        this.price = price;
    }

    public void addAddition1(String name, double price)
    {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addAddition2(String name, double price)
    {
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addAddition3(String name, double price)
    {
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addAddition4(String name, double price)
    {
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double hamburgerAddAddition()
    {
        double hamPrice = this.price;
        System.out.println("Initial price for "+ this.name +" hamburger on a " + this.breadRoll + " roll with meat " + this.meat + " is: " +  this.price );


        if(this.addition1Price > 0)
        {
            hamPrice += this.addition1Price;
            System.out.println("Add: " + this.addition1Name + ", with price: " + this.addition1Price);
        }

        if(this.addition2Price != 0)
        {
            hamPrice += this.addition2Price;
            System.out.println("Add: " + this.addition2Name + ", with price: " + this.addition2Price);
        }

        if(this.addition3Price != 0)
        {
            hamPrice += this.addition3Price;
            System.out.println("Add: " + this.addition3Name + ", with price: " + this.addition3Price);
        }


        if(this.addition4Price != 0)
        {
            hamPrice += this.addition4Price;
            System.out.println("Add: " + this.addition4Name + ", with price: " + this.addition4Price);
        }


        if (hamPrice > this.price)
        {
            System.out.println("Final " + this.name + " Hamburger price with additions is: " + hamPrice);
        }

        return hamPrice;
    }
}
