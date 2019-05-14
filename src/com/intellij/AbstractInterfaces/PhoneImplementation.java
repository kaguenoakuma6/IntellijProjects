package com.intellij.AbstractInterfaces;

public class PhoneImplementation
{
    public static void main(String[] args)
    {
        ITelephone phone;
        phone = new DeskPhone(123456789 );

        phone.powerOn();
        phone.callPhone(123456789);
        phone.answer();

        phone = new MobilePhone(2589);

        phone.powerOn();
        phone.callPhone(2589);
        phone.answer();
    }
}
