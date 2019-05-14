package com.intellij.Encapsulation;

public class EnchancedPlayer
{
    private String name, weapon ;
    private int healt = 100;

    public EnchancedPlayer(String name, String weapon, int healt)
    {
        this.name = name;
        this.weapon = weapon;

        if ( healt > 0  && healt <= 100)
        {
            this.healt = healt;
        }
    }

    public void loseHealth( int healt )
    {
        this.healt -= healt;

        if ( this.healt <= 0 )
        {
            System.out.println("Player Knocked Out!!!");
        }
    }

    public int getHealt()
    {
        return this.healt;
    }
}
