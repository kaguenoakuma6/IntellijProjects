package com.Utilidades;

import java.util.Base64;

public class base64Encrypt
{
    public static void main(String[] args)
    {
        String pass = "Contrasen1";

        byte [] encod = Base64.getEncoder().encode(pass.getBytes());

        String stEncod = new String(encod);

        System.out.println("tamaño: " + stEncod.length() + "\nCadena: " + stEncod);


        byte [] decod = Base64.getDecoder().decode(encod);

        String stDecod = new String(decod);

        System.out.println("tamaño: " + stDecod.length() + "\nCadena: " + stDecod );

    }
}
