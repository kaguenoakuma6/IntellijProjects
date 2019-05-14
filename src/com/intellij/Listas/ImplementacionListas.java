package com.intellij.Listas;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class ImplementacionListas
{
    private static Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    private static ListaCompras listaCompras = new ListaCompras();

    public static void main(String[] Args)
    {
        boolean salir = false;
        int opcion = 0;
        impInstrucciones();

        while (!salir)
        {
            System.out.print("Ingresa alguna de las opciones: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion)
            {
                case 0:
                    impInstrucciones();
                    break;
                case 1:
                    listaCompras.impListaCompras() ;
                    break;
                case 2:
                    agregarArticulo();
                    break;
                case 3:
                    modifArticulo();
                    break;
                case 4:
                    borrarArticulo();
                    break;
                case 5:
                    buscarArticulo();
                    break;
                case 6:
                    salir = true;
                    break;
            }
        }
    }

    public static void impInstrucciones()
    {
        System.out.println("\nPresiona");
        System.out.println("\t0 - Lista de opciones");
        System.out.println("\t1 - Imprimir lista de compras");
        System.out.println("\t2 - Agregar un articulo a la lista de compras");
        System.out.println("\t3 - Modificar un articulo de la lista de compras");
        System.out.println("\t4 - Borrar un articulo de la lista de compras");
        System.out.println("\t5 - Buscar un articulo en la lista de compras");
        System.out.println("\t6 - Salir");
    }

    public static void agregarArticulo()
    {
        System.out.print("Ingresa el articulo a agregar a la lista: ");
        listaCompras.agregarArticulo(scanner.nextLine());
    }

    public static void modifArticulo()
    {
        System.out.print("Ingrasa el nombre actual del articulo: ");
        String artNom = scanner.nextLine();

        System.out.print("Ingresa el nuevo nombre del Articulo: ");
        String art = scanner.nextLine();
        listaCompras.modificaArticulo(artNom, art);
    }

    public static void borrarArticulo()
    {
        System.out.print("ingresa el nombre del articulo a borrar: ");
        String art = scanner.nextLine();

        listaCompras.eliminaArticulo(art);
    }

    public static void buscarArticulo()
    {
        System.out.print("Ingresa el articulo a buscar: ");
        String art = scanner.nextLine();

        if (listaCompras.buscar(art))
        {
            System.out.println("Se encontro el articulo " + art + " en la lista de compras");
        }
        else
        {
            System.out.println("No se encontro el articulo " + art + " en la lista de compras");
        }
    }

    public static void procesaArray()
    {
        // copiar el contenido de una lista a otra a traves de las funciones de ArrayList
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(listaCompras.getListaCompras());

        // copiar el contenido de un ArrayList en la inicializacion de un nuevo ArrayList
        ArrayList<String> otroArray = new ArrayList<String>(listaCompras.getListaCompras());

        // Convertir un arrayLis en un array normal
        String[] myArray = new String[listaCompras.getListaCompras().size()];
        myArray = listaCompras.getListaCompras().toArray(myArray);
    }

}
