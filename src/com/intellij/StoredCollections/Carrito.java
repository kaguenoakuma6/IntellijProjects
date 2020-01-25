package com.intellij.StoredCollections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Carrito
{
    private final String nombre;
    private final Map<ArticulosExistentes, Integer> lista;

    public Carrito(String nombre)
    {
        this.nombre = nombre;
        this.lista = new HashMap<>();
    }

    public int agregarAlCarrito(ArticulosExistentes articulo, int cantidad)
    {
        if ((articulo != null) && (cantidad > 0))
        {
            int existencia = lista.getOrDefault(articulo, 0);
            lista.put(articulo, existencia + cantidad);

            return existencia;
        }
        return 0;
    }

    public Map<ArticulosExistentes, Integer> articulos()
    {
        return Collections.unmodifiableMap(lista);
    }

    @Override
    public String toString()
    {
        String s = "\nCarrito de Compras" + nombre + " contiene " + lista.size() + " articulos\n";

        double costoTotal = 0.0;

        for (Map.Entry<ArticulosExistentes, Integer> articulo : lista.entrySet())
        {
            s = s + articulo.getKey() + ". " + articulo.getValue() + " comprado\n";

            costoTotal += articulo.getKey().getPrecio() * articulo.getValue();
        }

        return s + "Costo Total: " + costoTotal;
    }
}
