package com.intellij.clas;

public class BankAccount
{
    private int accountNumber;
    private double balance;
    private String name, email, phone;

    /* Inicio Constructores */
    /* Los constructores pueden ser sobrecargados, asi como tambien un constructor puede ser invocado desde otro constructor, siempre y cunado este esté en la primera linea de ejecución */
    public BankAccount()
    {
        // invocando a otro constructor,
        this(123287,500.00,"Default name", "Default email","Default phone");
        System.out.println("constructor vacio");
    }

    public BankAccount(int accountNumber, double balance, String name, String email, String phone)
    {
        System.out.println("Inicializando las variables de la clase.");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public BankAccount(String name, String email, String phone)
    {
        this(231321,200.00, name, email, phone);
    }
    /* Fin Constructores */

    public void setAccountNumber(int accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber()
    {
        return this.accountNumber;
    }

    public void setBalance (double balance)
    {
        double validBalance = balance;

        if (validBalance > 0 )
        {
            this.balance = balance;
        }
        else
        {
            System.out.println("No hay saldo que ingresar a la cuenta");
        }
    }

    public double getBalance()
    {
        return this.balance;
    }

    public void setName(String name)
    {
        String validName = name;

        if ( validName.equals("") || validName == null)
        {
            System.out.println("no se ah  introducido un valor valido");
        }
        else
        {
            this.name = name;
        }
    }

    public String getName()
    {
        return this.name;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getEmail()
    {
        return this.email;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public String getPhone()
    {
        return this.phone;
    }

    public void setCash(float depo)
    {
        float total;
        this.balance += depo;

        //this
    }

    public void getcahs(float ret)
    {
        this.balance -= ret;
    }
}
