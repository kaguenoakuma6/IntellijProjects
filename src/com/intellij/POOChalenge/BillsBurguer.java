package com.intellij.POOChalenge;

public class BillsBurguer
{
    public static void main(String[] Args)
    {
        Hamburger hamburger = new Hamburger("Basic", "beeff steak", "white", 3.5);
        hamburger.addAddition1("tomotoes",.23);

        System.out.println("Price: " + hamburger.hamburgerAddAddition());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addAddition1("Egg", 5.43);
        healthyBurger.addHealtAddition1("Lentils" , 3.41);

        System.out.println("Total Healthy Burger Price is: " + healthyBurger.hamburgerAddAddition());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addAddition3("Should not do this", 50.53 );
        deluxeBurger.hamburgerAddAddition();
    }
}