package com.intellij.AutoUnBoxing;

public class ImplementsAUnboxing
{
    public static void main(String[] Args)
    {
        Banco banco = new Banco("Banco X");

        banco.agregarSucursal("SucursalX");
        banco.agregarCliente("SucursalX", "Tim", 200.12);
        banco.agregarCliente("SucursalX", "Luis", 15.20);
        banco.agregarCliente("SucursalX", "Pedro", 1009.53);


        banco.agregarSucursal("Sydney");
        banco.agregarCliente("Sydney", "Jose", 200.12);

        banco.agregarMovimientoCliente("SucursalX", "Tim", 68.21);
        banco.agregarMovimientoCliente("SucursalX", "Tim", 12.5);
        banco.agregarMovimientoCliente("SucursalX", "Pedro", 200.12);

        banco.listaClientes("SucursalX", true);


        banco.listaClientes("Sydney", true);

        if (!banco.agregarCliente("banorte", "luis", 564.01))
        {
            System.out.println("Sucursal no existe");
        }

        if (!banco.agregarSucursal("SucursalX"))
        {
            System.out.println("Sucursal ya existe");
        }

        if (!banco.agregarMovimientoCliente("SucursalX", "jose", 68.21))
        {
            System.out.println("Cliente no exsite en la sucursal");
        }
    }
}
/*
* Crear una aplicación básica de un banco
* Esta debera tener una clase Banco, esta a su vez debera tener un ArrayList de Sucursales
* Cada Sucursal debera tener un ArrayList de Clientes, y la clase Cliente debera tener un ArrayList de movimientos (Double):
* Clases y campos:
* Cliente --> Nombre y ArrayList de Double
* Sucursal --> Debera permitir agregar nuevos clientes con un monto inicial, asi como se necesitara agregar transacciones adicionales(después de la inicial) por Cliente / Sucursal
* Banco --> Debera permitir agregar nuevas Sucursales, agregar nuevos clientes para una sucursal especifica, asi como también mostrar la lista de clientes de una sucursal especifica
* Opcionalmente también la lista de transacciones por cada cliente de la sucursal
*
* Demostrar el Autoboxing y Unboxing en el código
*
* Indicio: Transacciones
*
* Agregar la validación de los datos --> si existe o no etc...
*
* Pensar y decidir en donde agregar el código para permitir ciertas acciones
*
 * */
