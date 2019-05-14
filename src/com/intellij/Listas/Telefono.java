package com.intellij.Listas;

import com.sun.istack.internal.Nullable;

import java.util.ArrayList;

public class Telefono
{
    private String miNumero;
    private ArrayList<Contacto> misContactos = new ArrayList<Contacto>();

    public Telefono(String miNumero)
    {
        this.miNumero = miNumero;
        this.misContactos = new ArrayList<Contacto>();
    }

    public boolean agregarContacto(Contacto contacto)
    {
        if (buscarContacto(contacto.getNombre()) >= 0 )
        {
            System.out.println("El contacto ya existe en el directorio" );
            return false;
        }

        misContactos.add(contacto);
        return true;
    }

    private int buscarContacto(Contacto contacto)
    {
        System.out.println("posicion: " + this.misContactos.indexOf(contacto) + "  " + contacto.getNombre());
        return this.misContactos.indexOf(contacto);
    }

    private int buscarContacto(String nombre)
    {
        for (int a = 0; a < this.misContactos.size(); a++)
        {
            Contacto contacto = this.misContactos.get(a);

            if (contacto.getNombre().equals(nombre))
            {
                return a;
            }
        }
        return -1;
    }

    private int buscarContactoTel(String telefono)
    {
        for (int b = 0; b < this.misContactos.size(); b++)
        {
            Contacto contacto = misContactos.get(b);

            if (contacto.getTelefono().equals(telefono))
            {
                return b;
            }
        }

        return -1;
    }

    public void imprimirContactos()
    {
        for (Contacto contacto : misContactos)
        {
            System.out.println("Nombre: " + contacto.getNombre() + "\nTeléfono : " + contacto.getTelefono()+"\n");
        }
    }

    public boolean actualizarContacto(Contacto antContacto, Contacto nvoContacto)
    {
        int pos = buscarContacto(antContacto);

        if (pos >= 0)
        {
            this.misContactos.set(pos, nvoContacto);
            System.out.println(antContacto.getNombre() + " fue reemplazado por " + nvoContacto.getNombre());
            return true;
        }

        System.out.println("El contacto no fue encontrado");

        return false;
    }


    public boolean borarContacto( Contacto contacto)
    {
        int pos = buscarContacto(contacto);

        if ( pos >= 0 )
        {
            this.misContactos.remove(pos);
            System.out.println("El contacto --> " + contacto.getNombre() +" a sido eliminado del directorio");
            return true;
        }

        System.out.println("El contacto no fue encontrado");
        return false;
    }

    public String consultarContacto(@Nullable Contacto contacto, @Nullable String nombre, @Nullable String telefono)
    {
        int pos = -1;
        Contacto contacto1 = contacto;

        if ( contacto1 != null )
        {
            //System.out.println("Contacto null");
            pos = buscarContacto(contacto1);
            System.out.println(contacto1.getNombre() + " ** " + contacto1.getTelefono());
            System.out.println(pos);

        }
        else if( nombre != null )
        {
            System.out.println("Buscando por nombre");
            pos = buscarContacto(nombre);
        }
        else if (telefono != null)
        {
            System.out.println("Buscando por telefono");
            pos = buscarContactoTel(telefono);
        }

        if ( pos >= 0)
        {
            contacto1 = misContactos.get(pos);
            System.out.println("el contacto fue encontrado.");
            System.out.println("Nombre: " + contacto1.getNombre() + "\nTelefono: " + contacto1.getTelefono());
            return contacto1.getNombre();
        }

        return null;
    }

}
