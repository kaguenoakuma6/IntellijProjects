package com.intellij.AbstractInterfaces;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class SaveableImplements
{
    public static void main(String[] args)
    {
        Player player = new Player("palyer", 10,15);
        System.out.println(player.toString());
        saveObject(player);

        player.setHitPoints(8);
        System.out.println(player);

        player.setWeapon("Another Weapon");
        System.out.println(player);
        saveObject(player);
        //loadObject(player);

        System.out.println(player);

        ISaveable werewolf = new Monster("Werewolf", 20, 200);
        // Se realiza un casteo de la interfaz a la clase para poder acceder a sus metodos
        System.out.println("Strength: " + ((Monster) werewolf).getStrength() );
        System.out.println(werewolf);
        saveObject(werewolf);
    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(ISaveable objectToSave)
    {
        for (int a = 0; a < objectToSave.write().size(); a++)
        {
            System.out.println("Saving " + objectToSave.write().get(a) + " to storage device");
        }
    }

    public static void loadObject(ISaveable objectToLoad)
    {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}
