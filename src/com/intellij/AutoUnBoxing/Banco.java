package com.intellij.AutoUnBoxing;

import java.util.ArrayList;

public class Banco
{
   private String nombre;
   private ArrayList<Sucursal> sucursales;

    public Banco(String nombre)
    {
        this.nombre = nombre;
        this.sucursales = new ArrayList<Sucursal>();
    }

    public boolean agregarSucursal(String nombreSucursal)
    {
        if ( buscarSucursal(nombreSucursal) == null )
        {
            this.sucursales.add(new Sucursal(nombreSucursal));
            return true;
        }

        return false;
    }

    public boolean agregarCliente(String nombreSucursal, String nombreCliente, double montoInicial)
    {
        Sucursal existSucursal = buscarSucursal(nombreSucursal);

        if( existSucursal != null)
        {
            return existSucursal.agregarCliente(nombreCliente, montoInicial);
        }

        return false;
    }

    private Sucursal buscarSucursal(String nombreSucursal)
    {
        for (int a = 0; a < this.sucursales.size(); a++)
        {
            Sucursal encontSucursal = this.sucursales.get(a );

            if (encontSucursal.getNombre().equals(nombreSucursal))
            {
                return encontSucursal;
            }
        }

        return null;
    }

    public boolean agregarMovimientoCliente(String nombreSucursal, String nombreCliente, double monto)
    {
        Sucursal sucursal = buscarSucursal(nombreSucursal);

        if (sucursal != null)
        {
            return sucursal.agregarMovimientoCliente(nombreCliente, monto);
        }

        return false;
    }

    public boolean listaClientes(String nombreSucursal, boolean muestraMovimientos)
    {
        Sucursal sucursal = buscarSucursal((nombreSucursal));
        int a,b;
        a = 1;

        if (sucursal != null)
        {
            System.out.println("Detalles de los clientes de la sucursal: " + nombreSucursal);

            ArrayList<Cliente> clientesSucursal = sucursal.getClientes();

            for (Cliente cliente : clientesSucursal)
            {
                System.out.println("Cliente [" + a + "] " + cliente.getNombre());

                if (muestraMovimientos)
                {
                    System.out.println("Transacciones: ");
                    ArrayList<Double> transacciones = cliente.getTransacciones();
                    b = 1;

                    for (Double transaccion : transacciones)
                    {
                        System.out.println("[" + b + "] Monto: \t" + transaccion);
                        b++;
                    }
                }

                a++;
            }

            return true;
        }
        else
        {
            return false;
        }
    }
}
