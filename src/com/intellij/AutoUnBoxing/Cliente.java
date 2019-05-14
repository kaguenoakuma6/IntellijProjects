package com.intellij.AutoUnBoxing;

import java.util.ArrayList;

public class Cliente
{
    private String nombre;
    private ArrayList<Double> transacciones;

    public Cliente(String nombre, double primerTransac)
    {
        this.nombre = nombre;
        this.transacciones = new ArrayList<Double>();
        agregarTransaccion(primerTransac);
    }

    public void agregarTransaccion(double monto )
    {
        this.transacciones.add(monto);
    }

    public String getNombre()
    {
        return this.nombre;
    }

    public ArrayList<Double> getTransacciones()
    {
        return this.transacciones;
    }
}
