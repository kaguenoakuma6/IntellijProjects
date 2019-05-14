package com.intellij.main;

import com.intellij.clas.VipCostumer;

public class MainBackup1
{
    public static void main(String[] arg)
    {
        VipCostumer costumer = new VipCostumer();

        VipCostumer costumer1 = new VipCostumer(200.0,"pepe");

        System.out.println("name: " + costumer1.getName() + " Credit: " + costumer1.getCreditLimit() + " email: " + costumer1.getEmail());

        VipCostumer costumer2 = new VipCostumer("hola",500.0,"myemail@mail.com");
        System.out.println("Name: " + costumer2.getName() + " Credit: " + costumer2.getCreditLimit() + " email: " +costumer2.getEmail());
        //
        /*
        // Bank accout test
        int option = 0;
        double balance;
        BankAccount account = new BankAccount();
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // ingresando el numero de cuenta desde la consola
        System.out.println("Enter Account Number");
        account.setAccountNumber(scanner.nextInt());
        //scanner.next();
        // ingresando el saldo desde la consola
        System.out.println("Enter the initial balance: ");
        balance = scanner.nextDouble();
        account.setBalance(balance);

        // ingresando el nombre desde la consola
        System.out.println("Enter Costumer Name: ");
        account.setName(scanner.next());

        // ingresando el correo desde la consola
        System.out.println("Enter Email: ");
        account.setEmail(scanner.next());
        // ingresando el telefono desde la consola
        System.out.println("Enter Phone: ");
        account.setPhone(scanner.next());

        do {
            System.out.println("Ingrese que desea realizar: \n1.- Add Cash: \n2.- get Cash: \n3.- Exit");
            option = scanner.nextInt();

            switch (option)
            {
                case 1:
                    System.out.println("Ingrese la cantidad a depositar: ");
                    account.setCash(scanner.nextFloat());
                    System.out.println("New Balance: $" + account.getBalance());
                    break;

                case 2:
                    float geet;
                    System.out.println("Ingresa la cantidad a retirar");
                    geet = scanner.nextFloat();

                    if (geet <= account.getBalance()) {
                        account.getcahs(geet);
                        System.out.println("New Balance: $" + account.getBalance());
                    } else {
                        System.out.println("Balance Isuficient");
                    }
                    break;
            }
        }
        while (option <= 2);

        */


        /*Car porsche =  new Car();

        porsche.setModel("Commodor");

        System.out.println("Model is: " + porsche.getModel());
        }*/
    }
}
