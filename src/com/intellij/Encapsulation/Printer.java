package com.intellij.Encapsulation;

public class Printer
{
    private int tonerLevel = 100, pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex)
    {
        if ( tonerLevel > 0 && tonerLevel <= 100 )
        {
            this.tonerLevel = tonerLevel;
        }
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }


    public void print(int pages)
    {
        int localPages = 0, aux, contt ;
        boolean printed = true;

        if( this.duplex )
        {
            localPages = pages * 2;
        }
        else
        {
            localPages = pages;
        }

        aux = localPages / 2;

        System.out.println(aux);

        for (contt = 1; contt <= aux; contt++ )
        {
            printed = this.spentToner(1);

            if (!printed)
            {
                break;
            }
        }

        this.pagesPrinted += contt -1 ;
        System.out.println((contt - 1) + " Pages Printed");

    }

    private boolean spentToner( int toner)
    {
        if (this.tonerLevel > 0 && this.tonerLevel >= toner )
        {
            this.tonerLevel -= toner;
            if ( this.tonerLevel <= 0 )
            {
                System.out.println(" Toner spent, please fill it.");
            }
            else
            {
                System.out.println("Actual toner level: " + this.tonerLevel);
            }
            return true;
        }
        else
        {
            System.out.println("Insufficient Toner , please fill it.");
            System.out.println("Current level of toner: " + this.tonerLevel +" , level necessary to process the request: " + toner);
            return false;
        }
    }

    public void fillToner(int toner)
    {
        if ( toner > 0 && toner <= 100 && this.tonerLevel + toner  <= 100)
        {
            this.tonerLevel = toner;
            System.out.println("Actual toner level : " + this.tonerLevel);
        }
        else
        {
            System.out.println("Set a valid level of toner ( greater than 0 - less or equals than 100");
        }
    }

    public int getTonerLevel()
    {
        return tonerLevel;
    }

    public int getPagesPrinted()
    {
        return pagesPrinted;
    }

    public boolean getDuplex()
    {
        return duplex;
    }
}
