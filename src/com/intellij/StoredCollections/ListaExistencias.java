package com.intellij.StoredCollections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ListaExistencias
{
    private final Map<String, ArticulosExistentes> lista;

    public ListaExistencias()
    {
        this.lista = new HashMap<>();
    }

    public int agregarArticluo( ArticulosExistentes articulo)
    {
        if (articulo != null)
        {
            ArticulosExistentes existencia = lista.getOrDefault(articulo.getNombre(), articulo);

            if (existencia != articulo)
            {
                articulo.ajustarExistencias(existencia.getExistencias());
            }

            lista.put(articulo.getNombre(), articulo);
            return articulo.getExistencias();
        }

        return 0;
    }

    public int venderArticulos(String articulo, int cantidad)
    {
        ArticulosExistentes existentes = lista.getOrDefault(articulo, null);

        if ((existentes != null) && (existentes.getExistencias() >= cantidad) && (cantidad > 0))
        {
            existentes.ajustarExistencias(-cantidad);
            return cantidad;
        }

        return 0;
    }

    public ArticulosExistentes get(String key)
    {
        return lista.get(key);
    }

    public Map<String, ArticulosExistentes> articulos()
    {
        return Collections.unmodifiableMap(lista);
    }

    @Override
    public String toString()
    {
        String s = "\nLista de Articulos";

        double costoTotal = 0.0;

        for (Map.Entry<String, ArticulosExistentes> articulo : lista.entrySet())
        {
            ArticulosExistentes articulosExistentes = articulo.getValue();

            double costoArticulo = articulosExistentes.getPrecio() * articulosExistentes.getExistencias();

            s = s + articulosExistentes + ". hay " + articulosExistentes.getExistencias() + " en existencia. Costo del articulo: " + costoArticulo + "\n";

            costoTotal += costoArticulo;
        }

        return s + "Costo Total: " + costoTotal;
    }
}
