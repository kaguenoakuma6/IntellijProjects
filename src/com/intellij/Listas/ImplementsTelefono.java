package com.intellij.Listas;

import java.util.Locale;
import java.util.Scanner;

public class ImplementsTelefono
{
    private static Telefono telefono = new Telefono("89215654");
    private static Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


    public static void main(String[] Args)
    {
        /*
        Contacto contacto = new Contacto("alejandro","3321354");

        telefono.agregarContacto(contacto);

        contacto = contacto.crearContacto("alejandr", "6565421654");
        telefono.agregarContacto(contacto);

        telefono.imprimirContactos();
        */
        
        boolean salir = false;
        int opcion = 0;

        encenderTelefono();
        impMenu();
        while (!salir)
        {
            System.out.print("Ingresa la accion deseada: " );
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion)
            {
                case 0:
                    System.out.println("Apagando Telefono.......");
                    salir = true;
                    break;
                case 1:
                    telefono.imprimirContactos();
                    break;
                case 2:
                    agregarContacto();
                    break;
                case 3:
                   // ActalizaContacto();
                    break;
                case 4:
                 //   borrarContacto();
                    break;
                case 5:
                    buscarContacto();
                    break;
                case 6:
                    impMenu();
                    break;
            }
        }
    }

    public static void impMenu()
    {
        System.out.println("\nPresiona");
        System.out.println("\t0 - Menu");
        System.out.println("\t1 - Imprimir Directorio Telefónico");
        System.out.println("\t2 - Agregar un Contacto al Directorio");
        System.out.println("\t3 - Modificar un Contacto del Directorio");
        System.out.println("\t4 - Borrar un Contacto del Directorio");
        System.out.println("\t5 - Buscar un Contacto en el Directorio");
        System.out.println("\t6 - Salir");
    }
    public static void encenderTelefono()
    {
        System.out.println("Encendiendo Telefono......");
    }

    public static void agregarContacto()
    {
        System.out.print("Ingresar el nombre del contacto: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingresar el numero de Teléfono del contacto: ");
        String telef = scanner.nextLine();

        Contacto contacto = Contacto.crearContacto(nombre, telef);

        telefono.agregarContacto(contacto);

    }


    public static void buscarContacto()
    {
        int opc;
        boolean salir =  false;
        String nombre,telef, salida ;

        System.out.println("Selecciona la opcion de busqueda deseada: \n0 - Contacto\n1 - Nombre Contacto\n2 - Telefono Contacto\n3 - Ver opciones de busqueda\n4 - Salir de busqueda");

        while (!salir)
        {
            System.out.print("Presiona la búsqueda deseada: ");
            opc = scanner.nextInt();
            scanner.nextLine();

            switch (opc)
            {
                case 0:
                    System.out.print("Ingresa el nombre del contacto: ");
                    nombre = scanner.nextLine();

                    System.out.print("Ingresa el teléfono del contacto: ");
                    telef = scanner.nextLine();

                    Contacto contactox = Contacto.crearContacto(nombre, telef);

                    salida = telefono.consultarContacto(contactox, null, null);

                    break;


                case 1:
                    System.out.print("Ingresa el nombre del contacto: ");
                    nombre = scanner.nextLine();

                    salida = telefono.consultarContacto(null, nombre, null);

                    break;

                case 2:
                    System.out.print("Ingresa el teléfono del contacto: ");
                    telef = scanner.nextLine();

                    salida = telefono.consultarContacto(null, null, telef);

                    break;

                case 3:
                    System.out.println("Selecciona la opcion de búsqueda deseada: \n0 - Contacto\n1 - Nombre Contacto\n2 - Telefono Contacto\n3 - Ver opciones de búsqueda\n4 - Salir de búsqueda");
                    break;

                case 4:
                    salir = true;
                    System.out.println("Saliendo del menu de búsqueda de contacto, regresando al menu principal...........");
                    break;
            }
        }
    }

}
