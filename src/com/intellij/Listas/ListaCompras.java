package com.intellij.Listas;

import java.util.ArrayList;

public class ListaCompras
{
    private ArrayList<String> listaCompras = new ArrayList<String>();

    public ArrayList<String> getListaCompras()
    {
        return listaCompras;
    }

    public void agregarArticulo(String articulo)
    {
        listaCompras.add(articulo);
        System.out.println("Se agrego el articulo > " + articulo +" < a la lista.");
    }

    public void impListaCompras()
    {
        System.out.println("Hay " + listaCompras.size() + " artículos en la lista. \nImprimiendo lista............");

        for (int u = 0; u < listaCompras.size(); u++)
        {
            System.out.println(u + 1 + ". " + listaCompras.get(u));
        }
    }

    public void modificaArticulo(String nombreAct, String nuevoNombre)
    {
        int pos = buscarArticulo(nombreAct);

        if (pos >= 0)
        {
            modificaArticulo(pos, nuevoNombre);
            System.out.println("Se a modificadlo el nombre del articulo de > " + nombreAct + " < a >" + nuevoNombre + " <");
        }
    }

    private  void modificaArticulo(int pos, String desc)
    {
        listaCompras.set(pos, desc);
    }

    public void eliminaArticulo(String  art)
    {
        int pos = buscarArticulo(art);

        if (pos >= 0)
        {
            eliminaArticulo(pos);
        }
    }

    private void eliminaArticulo(int pos)
    {
        String descArticulo = listaCompras.get(pos);
        listaCompras.remove(pos);
        System.out.println("Articulo de la lista > " + descArticulo + " < eliminado.");
    }

    public boolean buscar(String articulo)
    {
        int pos = buscarArticulo(articulo);

        if (pos >= 0)
        {
            return true;
        }

        return false;

    }

    private int buscarArticulo(String art)
    {
        return listaCompras.indexOf(art);
    }
    /*
    public String buscaArticulo(String art)
    {
        // boolean exists = listaCompras.contains(art);

        int pos = listaCompras.indexOf(art);

        if ( pos >= 0 )
        {
            return listaCompras.get(pos);
        }

        return null;
    }
    */
}
