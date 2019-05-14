package com.intellij.CollectionsModule;

import java.util.ArrayList;
import java.util.List;

public class TheatreImplementation
{
    public static void main(String[] args)
    {
        Theatre theatre = new Theatre("Principal", 8, 12);
        //theatre.getSeats();
        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);

        if(theatre.reserveSeat("H11"))
        {
            System.out.println("Pague por favor");
        }

        else
        {
            System.out.println("Lo sentimos el asiento esta ocupado!" );
        }

        if(theatre.reserveSeat("H11"))
        {
            System.out.println("Pague por favor");
        }

        else
        {
            System.out.println("Lo sentimos el asiento esta ocupado!");
        }
    }

    public static void printList(List<Theatre.Seat> list)
    {
        for (Theatre.Seat seat : list)
        {
            System.out.print(" " + seat.getSeatNumber());
        }

        System.out.println();
        System.out.println("============================================================================================================");
    }
}
