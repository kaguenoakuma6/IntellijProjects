package com.intellij.CollectionsModule;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Theatre
{
    private final String thatrename;
    public List<Seat> seats = new ArrayList<Seat>();

    public Theatre(String thatrename, int numRows, int seatsPerRows)
    {
        this.thatrename = thatrename;
        int lastRow = 'A' + (numRows - 1);

        for (char row = 'A'; row <= lastRow; row++)
        {
            for (int seatNum = 1; seatNum <= seatsPerRows; seatNum++)
            {
                Seat seat = new Seat(row + String.format("%02d", seatNum) );
                seats.add(seat);
            }
        }
    }

    public String getThatrename()
    {
        return thatrename;
    }

    public boolean reserveSeat(String seatNumber)
    {
        Seat requestedSeat = new Seat(seatNumber);
        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);

        if (foundSeat >= 0)
        {
            return seats.get(foundSeat).reserve();
        }
        else
        {
            System.out.println("No se encontro el asiento: " + seatNumber);
            return false;
        }
/*
        for (Seat seat : seats)
        {
            if (seat.getSeatNumber().equals(seatNumber))
            {
                requestedSeat = seat;
                break;
            }
        }

        if (requestedSeat == null)
        {
            System.out.println("No se encontro el Asiento: " + seatNumber);
            return false;
        }

        return requestedSeat.reserve();
*/
    }

    public void getSeats()
    {
        for (Seat seat : seats)
        {
            System.out.println(seat.getSeatNumber());
        }
    }

    public class Seat implements Comparable<Seat>
    {
        private final String seatNumber;
        private boolean reserved = false;

        public Seat(String seatNumber)
        {
            this.seatNumber = seatNumber;
        }

        @Override
        public int compareTo(Seat seat)
        {
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }

        public String getSeatNumber()
        {
            return seatNumber;
        }

        public boolean reserve()
        {
            if (!this.reserved)
            {
                this.reserved = true;
                System.out.println("Asiento: " + seatNumber + " reservado");
                return true;
            }
            else
            {
                return false;
            }
        }

        public boolean cancel()
        {
            if (this.reserved)
            {
                this.reserved = false;
                System.out.println("La reservacion del asiento: " + seatNumber + " a sido cancelado");
                return true;
            }
            else
            {
                return false;
            }
        }
    }



}
