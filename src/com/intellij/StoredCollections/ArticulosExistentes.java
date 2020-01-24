package com.intellij.StoredCollections;

public class ArticulosExistentes implements Comparable<ArticulosExistentes>
{
    private final String nombre;
    private double precio;
    private int existencias;

    public ArticulosExistentes(String nombre, double precio)
    {
        this.nombre = nombre;
        this.precio = precio;
        this.existencias = 0;
    }

    public ArticulosExistentes(String nombre, double precio, int existencias)
    {
        this.nombre = nombre;
        this.precio = precio;
        this.existencias = existencias;
    }

    public String getNombre()
    {
        return nombre;
    }

    public double getPrecio()
    {
        return precio;
    }

    public int getExistencias()
    {
        return existencias;
    }

    public void setPrecio(double precio)
    {
        if (precio > 0.0)
        {
            this.precio = precio;
        }
    }

    public void ajustarExistencias(int cantidad)
    {
        int nuevaCantidad = this.existencias + cantidad;

        if (nuevaCantidad >= 0)
        {
            this.existencias = nuevaCantidad;
        }
    }

    @Override
    public boolean equals(Object obj)
    {
        System.out.println("entrando en ArticulosExistentes.equals");

        if (obj == this)
        {
            return true;
        }

        if ((obj == null) || (obj.getClass() != this.getClass()))
        {
            return false;
        }
        String objName = ((ArticulosExistentes) obj).getNombre();
        return this.nombre.equals(objName);
    }

    @Override
    public int hashCode()
    {
        return this.nombre.hashCode();
    }

    @Override
    public int compareTo(ArticulosExistentes o)
    {
        System.out.println("Entrando ArticulosExistentes.compareTo");
        if (this == o)
        {
            return 0;
        }

        if (o != null)
        {
            return this.nombre.compareTo(o.getNombre());
        }
        throw new NullPointerException();
    }

    @Override
    public String toString()
    {
        return this.nombre + ": precio " + this.precio;
    }
}
