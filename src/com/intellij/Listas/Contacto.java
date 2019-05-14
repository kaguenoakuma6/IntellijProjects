package com.intellij.Listas;

import java.util.ArrayList;

public class Contacto
{
    private String nombre, telefono;

    public Contacto(String nombre, String telefono)
    {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre()
    {
        return nombre;
    }

    public String getTelefono()
    {
        return telefono;
    }

    public static Contacto crearContacto (String nombre, String telefono)
    {
        return new Contacto(nombre, telefono );
    }
}
