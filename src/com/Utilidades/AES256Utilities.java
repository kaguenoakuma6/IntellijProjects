package com.Utilidades;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class AES256Utilities
{
    public static void main(String[] args)
    {
        try
        {
            String token = "sIYphQHsMUY=";
            String desecBase = "KiWtFzIb5gFCU4H0cotzBQ==", desenc ="";

            //SecretKeySpec keySpec = new SecretKeySpec(token.getBytes(), "AES");
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding" );

            //cipher.init(Cipher.DECRYPT_MODE, keySpec);


            //desenc = new String(cipher.doFinal(Base64.getDecoder().decode(desecBase)));

            //System.out.println(desenc);
            desenc = new String(Base64.getDecoder().decode(token.getBytes("UTF-8")));
            System.out.println(desenc);

        }
        catch (Exception e )
        {
            e.printStackTrace();
        }
    }
}
