package com.intellij.LikedLists;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album
{
    private String titulo, artista;
    private ArrayList<Cancion> canciones;

    public Album(String titulo, String artista)
    {
        this.titulo = titulo;
        this.artista = artista;
        this.canciones = new ArrayList<Cancion>();
    }

    public boolean agregarCancion(String titulo, double duracion )
    {
        if (buscarCancion(titulo) == null)
        {
            this.canciones.add(new Cancion(titulo, duracion));
            return true;
        }
        return false;
    }

    private Cancion buscarCancion(String titulo)
    {
        for (Cancion cancion : this.canciones)
        {
            if (cancion.getTitulo().equals(titulo))
            {
                return cancion;
            }
        }

        return null;
    }

    public boolean agregarALista(int numeroCancion, LinkedList<Cancion> listaReproduccion)
    {

        int indice = numeroCancion - 1;

        if ((indice >= 0) && (indice <= this.canciones.size()))
        {
            listaReproduccion.add(this.canciones.get(indice));
            return true;
        }

        System.out.println("El Album " + this.titulo + " no tiene una canción " + indice);
        return false;
    }

    public boolean agregarALista(String titulo, LinkedList<Cancion> listaReproduccion)
    {

        Cancion encontrada = buscarCancion(titulo);

        if (encontrada != null)
        {
            listaReproduccion.add(encontrada);
            return true;
        }

        System.out.println("La canción " + titulo + " no esta en el album " + this.titulo);
        return false;
    }
}
