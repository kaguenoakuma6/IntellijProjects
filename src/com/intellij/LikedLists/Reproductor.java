package com.intellij.LikedLists;

import java.util.*;

public class Reproductor
{
    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args)
    {
        Album album = new Album("Stormbringer", "Deep purple");
        album.agregarCancion("Uno", 3.5);
        album.agregarCancion("Dos", 4.5);
        album.agregarCancion("Tres", 2.5);
        album.agregarCancion("Cuatro", 4.2);
        album.agregarCancion("Cinco", 6.5);
        album.agregarCancion("Seis", 3.8);
        album.agregarCancion("Siete", 3.0);
        album.agregarCancion("Ocho", 2.9);
        album.agregarCancion("Nueve", 7.5);
        album.agregarCancion("Diez", 8.0);

        albums.add(album);

        album = new Album("For those about to rock", "AC/DC" );
        album.agregarCancion("Uno", 3.5);
        album.agregarCancion("Dos", 4.5);
        album.agregarCancion("Tres", 2.5);
        album.agregarCancion("Cuatro", 4.2);
        album.agregarCancion("Cinco", 6.5);
        album.agregarCancion("Seis", 3.8);
        album.agregarCancion("Siete", 3.0);
        album.agregarCancion("Ocho", 2.9);
        album.agregarCancion("Nueve", 7.5);
        album.agregarCancion("Diez", 8.0);

        albums.add(album);

        LinkedList<Cancion> listaReproduccion = new LinkedList<Cancion>();

        albums.get(0).agregarALista("Cuatro", listaReproduccion);
        albums.get(0).agregarALista("Seis", listaReproduccion);
        albums.get(0).agregarALista("once", listaReproduccion);
        albums.get(0).agregarALista(9, listaReproduccion);
        albums.get(1).agregarALista(3, listaReproduccion);
        albums.get(1).agregarALista(8, listaReproduccion);
        albums.get(1).agregarALista(2, listaReproduccion);
        albums.get(1).agregarALista(12, listaReproduccion);


        reproducir(listaReproduccion);
    }

    private static void reproducir(LinkedList<Cancion> listaReprod)
    {
        ListIterator<Cancion> reprod = listaReprod.listIterator();

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        boolean continuar = true, adelante = true;

        if (listaReprod.size() == 0)
        {
            System.out.println("No hay canciones en la lista para reproducir");
            return;
        }
        else
        {
            System.out.println("Iniciando Reproductor.....");
            System.out.println("Reproduciendo " + reprod.next().toString());
        }

        menu();

        while (continuar)
        {
            int control = scanner.nextInt();
            scanner.nextLine();

            switch (control)
            {
                case 0:

                    System.out.println("Reproducción Finalizada.");
                    continuar = false;
                    break;

                case 1:

                    if (!adelante)
                    {
                        if (reprod.hasNext())
                        {
                            reprod.next();
                        }

                        adelante = true;
                    }

                    if (reprod.hasNext())
                    {
                        System.out.println("Reproduciendo Ahora --> " + reprod.next().toString());
                    }
                    else
                    {
                        System.out.println("Es el Final de la Lista de Reproducción");
                        adelante = false;
                    }

                    break;

                case 2:

                    if (adelante)
                    {
                        if (reprod.hasPrevious())
                        {
                            reprod.previous();
                        }

                        adelante = false;
                    }

                    if (reprod.hasPrevious())
                    {
                        System.out.println("Reproduciendo Ahora --> " + reprod.previous().toString());
                    }
                    else
                    {
                        System.out.println("Es el Inicio de la Lista de Reproducción");
                        adelante = true;
                    }

                    break;

                case 3:

                    if (adelante)
                    {
                        if (reprod.hasPrevious())
                        {
                            System.out.println("Reproduciendo Ahora --> " + reprod.previous().toString());
                            adelante = false;
                        }
                        else
                        {
                            System.out.println("Es el Inicio de la Lista de Reproducción");
                        }
                    }
                    else
                    {
                        if (reprod.hasNext())
                        {
                            System.out.println("Reproduciendo Ahora --> " + reprod.next().toString());
                            adelante = true;
                        }
                        else
                        {
                            System.out.println("Es el Final de la Lista de Reproducción");
                        }
                    }

                    break;

                case 4:

                    imprimeLista(listaReprod);
                    break;

                case 5:

                    if (listaReprod.size() > 0)
                    {
                        reprod.remove();

                        if (reprod.hasNext())
                        {
                            System.out.println("Reproduciendo Ahora --> " + reprod.next().toString());
                        }
                        else if (reprod.hasPrevious())
                        {
                            System.out.println("Reproduciendo Ahora --> " + reprod.previous().toString());
                        }
                    }
                    break;

                case 6:

                    menu();
                    break;
            }
        }
    }

    private static void menu()
    {
        System.out.println("Opciones disponibles.\nPresiona: ");
        System.out.println("0 - Salir\n1 - Siguiente\n2 - Anterior\n3 - Repetir Actual\n4 - Imprimir Lista de Reproducción\n5 - Eliminar Pista Actual\n6 - Ver Opciones");
    }

    private static void imprimeLista(LinkedList<Cancion> listaReproduccion)
    {
        Iterator<Cancion> imprime = listaReproduccion.iterator();

        System.out.println("***************************");

        while (imprime.hasNext())
        {
            System.out.println(imprime.next().toString());
        }
        System.out.println("***************************");
    }

}
