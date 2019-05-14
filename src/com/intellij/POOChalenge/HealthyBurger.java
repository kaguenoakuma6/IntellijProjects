package com.intellij.POOChalenge;

public class HealthyBurger extends Hamburger
{
    private String healthyExtra1Name, healthyExtra2Name;
    private double healthyExtra1Price, healthyExtra2Price;

    public HealthyBurger(String meat, double price)
    {
        super("Healthy", meat, "Brown rye", price);
    }

    public void addHealtAddition1 (String name, double price)
    {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealtAddition2(String name, double price )
    {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double hamburgerAddAddition()
    {
        double hamburgerPrice = super.hamburgerAddAddition();

        if ( this.healthyExtra1Price > 0 )
        {
            hamburgerPrice += this.healthyExtra1Price;
            System.out.println("Add: " + this.healthyExtra1Name + ", with price: " + this.healthyExtra1Price );
        }

        if ( this.healthyExtra2Price > 0 )
        {
            hamburgerPrice += this.healthyExtra2Price;
            System.out.println("Add: " + this.healthyExtra2Name + ", with price: " + this.healthyExtra2Price);
        }

        return hamburgerPrice;
    }
}
