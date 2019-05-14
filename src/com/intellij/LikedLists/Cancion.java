package com.intellij.LikedLists;

public class Cancion
{
    private String titulo;

    private double duracion;

    public Cancion(String titulo, double duracion)
    {
        this.titulo = titulo;
        this.duracion = duracion;
    }

    public String getTitulo()
    {
        return titulo;
    }


    @Override
    public String toString()
    {
        return this.titulo + ": " + this.duracion ;
    }
}
