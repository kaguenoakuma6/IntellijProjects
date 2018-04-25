package com.intellij.Composition;

public class Motherboard
{
    private String model, manufacturer, bios;
    private int ramSlots, cardSlots;

    public Motherboard(String model, String manufacturer, String bios, int ramSlots, int cardSlots)
    {
        this.model = model;
        this.manufacturer = manufacturer;
        this.bios = bios;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
    }

    public void loadProgram(String program)
    {
        System.out.println("Program " + program + " is now loading.....");
    }

    public String getModel()
    {
        return model;
    }

    public String getManufacturer()
    {
        return manufacturer;
    }

    public String getBios()
    {
        return bios;
    }

    public int getRamSlots()
    {
        return ramSlots;
    }

    public int getCardSlots()
    {
        return cardSlots;
    }
}
