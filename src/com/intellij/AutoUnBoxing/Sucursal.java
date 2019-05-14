package com.intellij.AutoUnBoxing;

import java.util.ArrayList;

public class Sucursal
{
    private String nombre;
    private ArrayList<Cliente> clientes;

    public Sucursal(String nombre)
    {
        this.nombre = nombre;
        this.clientes = new ArrayList<Cliente>();
    }

    public String getNombre()
    {
        return nombre;
    }

    public boolean agregarCliente(String nombreCliente, double montoInicial)
    {
        if ( buscaCliente(nombreCliente) == null )
        {
            this.clientes.add(new Cliente(nombreCliente, montoInicial));
            return true;
        }

        return false;
    }

    public boolean agregarMovimientoCliente(String nombreCliente, double monto)
    {
        Cliente existCliente = buscaCliente(nombreCliente );

        if (existCliente != null)
        {
            existCliente.agregarTransaccion(monto);
            return true;
        }

        return false;
    }

    private Cliente buscaCliente(String nombreCliente)
    {
        for (int a = 0; a < this.clientes.size(); a++)
        {
            Cliente clienteActual = this.clientes.get(a);

            if (clienteActual.getNombre().equals(nombreCliente))
            {
                return clienteActual;
            }
        }

        return null;
    }

    public ArrayList<Cliente> getClientes()
    {
        return clientes;
    }
}
