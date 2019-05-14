package com.intellij.clas;

public class VipCostumer
{
    private String name, email;
    private double creditLimit;

    /*Inicio Constructores*/
    public VipCostumer()
    {

    }

    public VipCostumer(String name, double creditLimit, String email)
    {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public VipCostumer(double creditLimit, String email)
    {
        this("Default name", creditLimit, email );
    }

    /*Inicio Constructores*/

    public String getName()
    {
        return this.name;
    }

    public String getEmail()
    {
        return this.email;
    }

    public double getCreditLimit()
    {
        return this.creditLimit;
    }
}
