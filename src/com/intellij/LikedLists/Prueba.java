package com.intellij.LikedLists;

import java.util.*;

public class Prueba
{
    public static void main(String[] args)
    {
        LinkedList<String> lugaresVisitar = new LinkedList<String>();

        agregaOrdenado(lugaresVisitar,"Sydney");
        agregaOrdenado(lugaresVisitar,"Melbourne");
        agregaOrdenado(lugaresVisitar,"Brisbane");
        agregaOrdenado(lugaresVisitar,"Perth");
        agregaOrdenado(lugaresVisitar,"Canberra");
        agregaOrdenado(lugaresVisitar,"Adelaide");
        agregaOrdenado(lugaresVisitar,"Darwin");

        imprimirLista(lugaresVisitar);

        agregaOrdenado(lugaresVisitar,"Alice Springs" );
        agregaOrdenado(lugaresVisitar,"Darwin");

        imprimirLista(lugaresVisitar);


        visitar(lugaresVisitar);

       // lugaresVisitar.remove(4);

        //imprimirLista(lugaresVisitar);
    }

    public static void imprimirLista(LinkedList<String> lugares)
    {
        Iterator<String> lugar = lugares.iterator();

        while (lugar.hasNext())
        {
            System.out.println("Visitando Ahora: " + lugar.next());
        }
        System.out.println("\n============================================\n");
    }


    private static boolean agregaOrdenado(LinkedList<String> lugares, String nuevaCiudad)
    {
        ListIterator<String> lugaress = lugares.listIterator();

        while (lugaress.hasNext())
        {
            int comparacion = lugaress.next().compareTo(nuevaCiudad);

            if (comparacion == 0)
            {
                System.out.println(nuevaCiudad + " ya esta incluido en los destinos");
                return false;
            }
            else if ( comparacion > 0 )
            {
                lugaress.previous();
                lugaress.add(nuevaCiudad);
                return true;
            }
            else if (comparacion < 0)
            {

            }
        }

        lugaress.add(nuevaCiudad);
        return true;
    }


    private static void visitar(LinkedList ciudades)
    {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        boolean continuar = true, avanzando = true;
        ListIterator<String> recorrer = ciudades.listIterator();
        int opcion = 0;

        if (ciudades.isEmpty())
        {
            System.out.println("No hay ciudades para visitar.");
            return;
        }
        else
        {
            System.out.println("Ahora estas visitando: " + recorrer.next());
            imprimeMenu();
        }

        while (continuar)
        {
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion)
            {
                case 0:
                    System.out.println("Dila Libre (Vacaciones)");
                    continuar = false;
                    break;

                case 1:

                    if (!avanzando)
                    {
                        if (recorrer.hasNext())
                        {
                            recorrer.next();
                        }
                    }

                    avanzando = true;

                    if ( recorrer.hasNext() )
                    {
                        System.out.println("Ahora Estas Visitando: " + recorrer.next());
                    }
                    else
                    {
                        System.out.println("Ya no hay mas ciudades por visitar, fin de la lista.....");
                        avanzando = false;
                    }

                    break;

                case 2:

                    if (avanzando)
                    {
                        if (recorrer.hasPrevious())
                        {
                            recorrer.previous();
                        }
                    }

                    avanzando = false;

                    if ( recorrer.hasPrevious() )
                    {
                        System.out.println("Ahora Estas Visitando: " + recorrer.previous());
                    }
                    else
                    {
                        System.out.println("Estas en el inicio de la lista.....");
                        avanzando = true;
                    }
                    break;

                case 3:
                    imprimeMenu();
                    break;
            }
        }
    }

    private static void imprimeMenu()
    {
        System.out.println("Opciones Disponibles:\nPresiona:\n0 - Salir\n1 - Siguiente Ciudad\n2 - Ciudad Anterior\n3 - Menu de Opciones");
    }

}
